package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsSite;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsSiteManager extends HibernateEntityDao<CmsSite> {
}
