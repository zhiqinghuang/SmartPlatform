package com.mossle.org.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.org.persistence.domain.JobInfo;

@Service
public class JobInfoManager extends HibernateEntityDao<JobInfo> {
}

//need to confirm