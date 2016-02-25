package com.mossle.internal.whitelist.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.whitelist.persistence.domain.WhitelistType;

@Service
public class WhitelistTypeManager extends HibernateEntityDao<WhitelistType> {
}

//need to confirm