package com.mossle.security.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mossle.core.auth.CustomPasswordEncoder;

public class PasswordEncoderFactoryBean implements FactoryBean<PasswordEncoder>, InitializingBean {
	private static Logger logger = LoggerFactory.getLogger(PasswordEncoderFactoryBean.class);
	private String type;
	private PasswordEncoder passwordEncoder;
	private CharSequence salt;

	public void afterPropertiesSet() {
		if ("md5".equals(type)) {
			this.passwordEncoder = new Md5PasswordEncoder(salt);
		} else {
			this.passwordEncoder = NoOpPasswordEncoder.getInstance();
		}
		logger.info("choose {}", passwordEncoder.getClass());
	}

	public PasswordEncoder getObject() {
		return passwordEncoder;
	}

	public Class<PasswordEncoder> getObjectType() {
		return PasswordEncoder.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CustomPasswordEncoder getCustomPasswordEncoder() {
		return new SimplePasswordEncoder(this.passwordEncoder);
	}

	public void setSalt(CharSequence salt) {
		this.salt = salt;
	}
}
//need to confirm