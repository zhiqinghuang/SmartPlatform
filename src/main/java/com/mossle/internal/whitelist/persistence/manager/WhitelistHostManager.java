package com.mossle.internal.whitelist.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.whitelist.persistence.domain.WhitelistHost;

@Service
public class WhitelistHostManager extends HibernateEntityDao<WhitelistHost> {
}

//need to confirm