package com.mossle.user.support;

import javax.annotation.Resource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.mossle.api.user.UserDTO;
import com.mossle.api.user.UserSyncConnector;

public class DatabaseUserSyncConnector implements UserSyncConnector {
	private JdbcTemplate jdbcTemplate;
	private String sqlFindByCode = "select count(*) from ACCOUNT_INFO where code=?";
	private String sqlUpdate = "update ACCOUNT_INFO set username=?,nick_name=?,display_name=?,status='active' where code=?";
	private String sqlInsert = "insert into ACCOUNT_INFO(code,username,nick_name,display_name,status) values(?,?,?,?,'active')";

	@Transactional
	public void updateUser(UserDTO userDto) {
		Assert.notNull(userDto, "userDto should not be null");
		String code = userDto.getRef();
		int count = jdbcTemplate.queryForObject(sqlFindByCode, Integer.class, code);
		if (count > 0) {
			jdbcTemplate.update(sqlUpdate, new Object[] { userDto.getUsername(), userDto.getNickName(), userDto.getDisplayName(), code });
		} else {
			jdbcTemplate.update(sqlInsert, new Object[] { code, userDto.getUsername(), userDto.getNickName(), userDto.getDisplayName() });
		}
	}

	@Resource
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
//need to confirm