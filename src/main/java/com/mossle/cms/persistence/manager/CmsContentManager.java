package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsContent;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsContentManager extends HibernateEntityDao<CmsContent> {
}
