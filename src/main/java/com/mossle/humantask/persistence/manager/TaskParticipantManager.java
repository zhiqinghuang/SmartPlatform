package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.TaskParticipant;

@Service
public class TaskParticipantManager extends HibernateEntityDao<TaskParticipant> {
}
