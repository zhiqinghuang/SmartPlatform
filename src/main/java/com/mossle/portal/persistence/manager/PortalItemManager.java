package com.mossle.portal.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.portal.persistence.domain.PortalItem;

@Service
public class PortalItemManager extends HibernateEntityDao<PortalItem> {
}
