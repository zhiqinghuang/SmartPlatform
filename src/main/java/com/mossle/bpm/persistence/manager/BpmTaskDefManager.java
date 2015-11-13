package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmTaskDef;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmTaskDefManager extends HibernateEntityDao<BpmTaskDef> {
}
