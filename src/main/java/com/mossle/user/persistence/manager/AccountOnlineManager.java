package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.AccountOnline;

@Service
public class AccountOnlineManager extends HibernateEntityDao<AccountOnline> {
}

//need to confirm