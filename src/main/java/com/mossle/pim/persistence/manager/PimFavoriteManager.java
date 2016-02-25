package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.PimFavorite;

@Service
public class PimFavoriteManager extends HibernateEntityDao<PimFavorite> {
}

//need to confirm