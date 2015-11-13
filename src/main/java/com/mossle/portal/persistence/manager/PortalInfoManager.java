package com.mossle.portal.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.portal.persistence.domain.PortalInfo;

@Service
public class PortalInfoManager extends HibernateEntityDao<PortalInfo> {
}
