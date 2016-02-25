package com.mossle.auth.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.auth.persistence.domain.Perm;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class PermManager extends HibernateEntityDao<Perm> {
}

//need to confirm