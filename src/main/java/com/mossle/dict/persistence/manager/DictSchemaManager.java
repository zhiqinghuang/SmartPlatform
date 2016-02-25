package com.mossle.dict.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.dict.persistence.domain.DictSchema;

@Service
public class DictSchemaManager extends HibernateEntityDao<DictSchema> {
}

//need to confirm