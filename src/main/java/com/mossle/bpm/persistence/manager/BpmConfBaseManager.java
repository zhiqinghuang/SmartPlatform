package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfBase;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfBaseManager extends HibernateEntityDao<BpmConfBase> {
}
