package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.AccountLockLog;

@Service
public class AccountLockLogManager extends HibernateEntityDao<AccountLockLog> {
}

//need to confirm