package com.mossle.auth.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.auth.persistence.domain.Role;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class RoleManager extends HibernateEntityDao<Role> {
}
