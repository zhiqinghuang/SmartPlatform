package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfRule;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfRuleManager extends HibernateEntityDao<BpmConfRule> {
}

//need to confirm