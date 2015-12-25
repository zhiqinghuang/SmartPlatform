package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsTagArticle;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsTagArticleManager extends HibernateEntityDao<CmsTagArticle> {
}
