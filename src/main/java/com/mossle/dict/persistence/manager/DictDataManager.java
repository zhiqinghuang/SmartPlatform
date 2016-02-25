package com.mossle.dict.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.dict.persistence.domain.DictData;

@Service
public class DictDataManager extends HibernateEntityDao<DictData> {
}

//need to confirm