package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.AccountAvatar;

@Service
public class AccountAvatarManager extends HibernateEntityDao<AccountAvatar> {
}

//need to confirm