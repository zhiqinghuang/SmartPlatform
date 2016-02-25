package com.mossle.auth.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.auth.persistence.domain.RoleDef;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class RoleDefManager extends HibernateEntityDao<RoleDef> {
}

//need to confirm