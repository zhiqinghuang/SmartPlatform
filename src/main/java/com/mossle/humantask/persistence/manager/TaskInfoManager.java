package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskInfo;

@Service
public class TaskInfoManager extends HibernateEntityDao<TaskInfo> {
}

//need to confirm