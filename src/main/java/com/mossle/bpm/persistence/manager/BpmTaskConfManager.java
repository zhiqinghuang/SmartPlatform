package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmTaskConf;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmTaskConfManager extends HibernateEntityDao<BpmTaskConf> {
}

//need to confirm