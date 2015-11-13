package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfCountersign;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfCountersignManager extends HibernateEntityDao<BpmConfCountersign> {
}
