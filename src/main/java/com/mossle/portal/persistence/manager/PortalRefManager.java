package com.mossle.portal.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.portal.persistence.domain.PortalRef;

@Service
public class PortalRefManager extends HibernateEntityDao<PortalRef> {
}
