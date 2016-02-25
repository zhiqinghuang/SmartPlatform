package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDefBase;

@Service
public class TaskDefBaseManager extends HibernateEntityDao<TaskDefBase> {
}

//need to confirm