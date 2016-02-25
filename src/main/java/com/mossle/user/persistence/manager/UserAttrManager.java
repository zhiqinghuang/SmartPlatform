package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.UserAttr;

@Service
public class UserAttrManager extends HibernateEntityDao<UserAttr> {
}

//need to confirm