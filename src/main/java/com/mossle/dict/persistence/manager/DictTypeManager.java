package com.mossle.dict.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.dict.persistence.domain.DictType;

@Service
public class DictTypeManager extends HibernateEntityDao<DictType> {
}

//need to confirm