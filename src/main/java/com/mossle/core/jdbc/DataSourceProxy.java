package com.mossle.core.jdbc;

import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DataSourceProxy extends MockDataSource {
	private DataSource targetDataSource;

	public Connection getConnection() throws SQLException {
		return this.targetDataSource.getConnection();
	}

	public Connection getConnection(String username, String password) throws SQLException {
		return this.targetDataSource.getConnection(username, password);
	}

	public PrintWriter getLogWriter() throws SQLException {
		return this.targetDataSource.getLogWriter();
	}

	public void setLogWriter(PrintWriter out) throws SQLException {
		this.targetDataSource.setLogWriter(out);
	}

	public void setLoginTimeout(int seconds) throws SQLException {
		this.targetDataSource.setLoginTimeout(seconds);
	}

	public int getLoginTimeout() throws SQLException {
		return this.targetDataSource.getLoginTimeout();
	}

	// JDK 6
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return this.targetDataSource.isWrapperFor(iface);
	}

	// JDK 6
	public <T> T unwrap(Class<T> iface) throws SQLException {
		return this.targetDataSource.unwrap(iface);
	}

	public DataSource getTargetDataSource() {
		return this.targetDataSource;
	}

	public void setTargetDataSource(DataSource targetDataSource) {
		this.targetDataSource = targetDataSource;
	}
}