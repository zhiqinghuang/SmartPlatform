package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDefUser;

@Service
public class TaskDefUserManager extends HibernateEntityDao<TaskDefUser> {
}

//need to confirm