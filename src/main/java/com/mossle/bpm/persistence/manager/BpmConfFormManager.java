package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfForm;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfFormManager extends HibernateEntityDao<BpmConfForm> {
}

//need to confirm