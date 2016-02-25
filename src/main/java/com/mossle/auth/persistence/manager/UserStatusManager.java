package com.mossle.auth.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.auth.persistence.domain.UserStatus;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class UserStatusManager extends HibernateEntityDao<UserStatus> {
}

//need to confirm