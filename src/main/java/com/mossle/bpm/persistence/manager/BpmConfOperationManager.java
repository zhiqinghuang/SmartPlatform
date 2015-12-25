package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfOperation;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfOperationManager extends HibernateEntityDao<BpmConfOperation> {
}
