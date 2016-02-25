package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsComment;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsCommentManager extends HibernateEntityDao<CmsComment> {
}

//need to confirm