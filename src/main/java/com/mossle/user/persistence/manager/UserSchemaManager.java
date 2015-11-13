package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.UserSchema;

@Service
public class UserSchemaManager extends HibernateEntityDao<UserSchema> {
}
