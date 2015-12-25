package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.AccountLockInfo;

@Service
public class AccountLockInfoManager extends HibernateEntityDao<AccountLockInfo> {
}
