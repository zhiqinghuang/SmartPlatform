package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDefNotification;

@Service
public class TaskDefNotificationManager extends HibernateEntityDao<TaskDefNotification> {
}

//need to confirm