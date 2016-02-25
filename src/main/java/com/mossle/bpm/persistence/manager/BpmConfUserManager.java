package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfUser;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfUserManager extends HibernateEntityDao<BpmConfUser> {
}

//need to confirm