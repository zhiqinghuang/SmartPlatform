package com.mossle.org.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.org.persistence.domain.JobTitle;

@Service
public class JobTitleManager extends HibernateEntityDao<JobTitle> {
}

//need to confirm