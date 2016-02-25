package com.mossle.internal.sendmail.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.sendmail.persistence.domain.SendmailConfig;

@Service
public class SendmailConfigManager extends HibernateEntityDao<SendmailConfig> {
}

//need to confirm