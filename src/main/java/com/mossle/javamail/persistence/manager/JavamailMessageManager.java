package com.mossle.javamail.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.javamail.persistence.domain.JavamailMessage;

@Service
public class JavamailMessageManager extends HibernateEntityDao<JavamailMessage> {
}
