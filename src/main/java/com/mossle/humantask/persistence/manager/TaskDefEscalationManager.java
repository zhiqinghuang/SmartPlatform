package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskDefEscalation;

@Service
public class TaskDefEscalationManager extends HibernateEntityDao<TaskDefEscalation> {
}
