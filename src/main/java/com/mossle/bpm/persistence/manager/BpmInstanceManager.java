package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmInstance;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmInstanceManager extends HibernateEntityDao<BpmInstance> {
}

//need to confirm