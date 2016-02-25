package com.mossle.internal.sendmail.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.sendmail.persistence.domain.SendmailQueue;

@Service
public class SendmailQueueManager extends HibernateEntityDao<SendmailQueue> {
}

//need to confirm