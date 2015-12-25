package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsClick;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsClickManager extends HibernateEntityDao<CmsClick> {
}
