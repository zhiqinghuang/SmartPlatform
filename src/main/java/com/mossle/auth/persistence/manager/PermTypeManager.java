package com.mossle.auth.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.auth.persistence.domain.PermType;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class PermTypeManager extends HibernateEntityDao<PermType> {
}

//need to confirm