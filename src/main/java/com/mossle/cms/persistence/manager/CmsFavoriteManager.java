package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsFavorite;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsFavoriteManager extends HibernateEntityDao<CmsFavorite> {
}

//need to confirm