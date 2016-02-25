package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfListener;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfListenerManager extends HibernateEntityDao<BpmConfListener> {
}

//need to confirm