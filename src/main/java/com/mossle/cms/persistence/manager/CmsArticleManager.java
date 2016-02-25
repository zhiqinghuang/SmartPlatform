package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsArticle;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsArticleManager extends HibernateEntityDao<CmsArticle> {
}

//need to confirm