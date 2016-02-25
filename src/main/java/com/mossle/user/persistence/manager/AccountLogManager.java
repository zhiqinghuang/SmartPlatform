package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.AccountLog;

@Service
public class AccountLogManager extends HibernateEntityDao<AccountLog> {
}

//need to confirm