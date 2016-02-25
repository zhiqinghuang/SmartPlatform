package com.mossle.internal.whitelist.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.whitelist.persistence.domain.WhitelistIp;

@Service
public class WhitelistIpManager extends HibernateEntityDao<WhitelistIp> {
}

//need to confirm