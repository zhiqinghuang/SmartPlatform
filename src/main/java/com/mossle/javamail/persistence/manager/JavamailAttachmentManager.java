package com.mossle.javamail.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.javamail.persistence.domain.JavamailAttachment;

@Service
public class JavamailAttachmentManager extends HibernateEntityDao<JavamailAttachment> {
}
