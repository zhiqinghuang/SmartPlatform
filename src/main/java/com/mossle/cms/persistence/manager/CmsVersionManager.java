package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsVersion;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsVersionManager extends HibernateEntityDao<CmsVersion> {
}

//need to confirm