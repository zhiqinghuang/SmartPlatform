package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.HtHumantask;

@Service
public class HtHumantaskManager extends HibernateEntityDao<HtHumantask> {
}
