package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDefDeadline;

@Service
public class TaskDefDeadlineManager extends HibernateEntityDao<TaskDefDeadline> {
}

//need to confirm