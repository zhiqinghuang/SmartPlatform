package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDeadline;

@Service
public class TaskDeadlineManager extends HibernateEntityDao<TaskDeadline> {
}

//need to confirm