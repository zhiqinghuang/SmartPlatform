package com.mossle.core.hsqldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hsqldb.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsqldbServer {
	private static Logger logger = LoggerFactory.getLogger(HsqldbServer.class);
	public static final int WAIT_TIME = 1000;
	private boolean enabled = false;
	private String username;
	private String password;
	private int port;
	private String path;
	private String databaseName;
	private String url;

	@PostConstruct
	public void init() {
		if (!enabled) {
			logger.info("skip hsqldb server");
			return;
		}
		try {
			String databasePath = path + "/" + databaseName;
			url = "jdbc:hsqldb:hsql://localhost:" + port + "/" + databaseName;
			Server server = new Server();
			server.setDatabaseName(0, databaseName);
			server.setDatabasePath(0, databasePath);
			server.setPort(port);
			server.setSilent(true);
			server.start();
			Thread.sleep(WAIT_TIME);
		} catch (InterruptedException ex) {
			logger.error(ex.getMessage(), ex);
		}
	}

	@PreDestroy
	public void destroy() {
		if (!enabled) {
			logger.info("skip hsqldb server");
			return;
		}
		try {
			Class.forName("org.hsqldb.jdbcDriver");
			Connection conn = null;
			Statement state = null;
			try {
				// 向数据库发送shutdown命令，关闭数据库
				conn = DriverManager.getConnection(url, username, password);
				state = conn.createStatement();
				state.executeUpdate("SHUTDOWN;");
			} catch (SQLException ex1) {
				logger.error(ex1.getMessage(), ex1);
			} finally {
				// 确保关闭Statement
				if (state != null) {
					try {
						state.close();
						state = null;
					} catch (SQLException ex1) {
						logger.error(ex1.getMessage(), ex1);
					}
				}
				// 确保关闭Connection
				if (conn != null) {
					try {
						conn.close();
						conn = null;
					} catch (SQLException ex1) {
						logger.error(ex1.getMessage(), ex1);
					}
				}
			}
		} catch (ClassNotFoundException ex) {
			logger.error(ex.getMessage(), ex);
		}
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}
//need to confirm