package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsTag;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsTagManager extends HibernateEntityDao<CmsTag> {
}
