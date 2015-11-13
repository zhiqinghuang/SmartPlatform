package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsCatalog;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsCatalogManager extends HibernateEntityDao<CmsCatalog> {
}
