package com.mossle.org.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.org.persistence.domain.JobGrade;

@Service
public class JobGradeManager extends HibernateEntityDao<JobGrade> {
}

//need to confirm