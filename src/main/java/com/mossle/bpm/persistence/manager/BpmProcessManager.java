package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmProcess;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmProcessManager extends HibernateEntityDao<BpmProcess> {
}
