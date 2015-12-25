package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmCategory;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmCategoryManager extends HibernateEntityDao<BpmCategory> {
}
