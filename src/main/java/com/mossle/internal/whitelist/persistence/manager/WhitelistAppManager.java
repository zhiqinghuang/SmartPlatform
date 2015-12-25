package com.mossle.internal.whitelist.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.whitelist.persistence.domain.WhitelistApp;

@Service
public class WhitelistAppManager extends HibernateEntityDao<WhitelistApp> {
}
