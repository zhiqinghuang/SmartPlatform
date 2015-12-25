package com.mossle.org.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.org.persistence.domain.JobLevel;

@Service
public class JobLevelManager extends HibernateEntityDao<JobLevel> {
}
