package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDefOperation;

@Service
public class TaskDefOperationManager extends HibernateEntityDao<TaskDefOperation> {
}

//need to confirm