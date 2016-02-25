package com.mossle.dict.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.dict.persistence.domain.DictInfo;

@Service
public class DictInfoManager extends HibernateEntityDao<DictInfo> {
}

//need to confirm