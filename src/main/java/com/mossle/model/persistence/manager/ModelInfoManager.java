package com.mossle.model.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.model.persistence.domain.ModelInfo;

@Service
public class ModelInfoManager extends HibernateEntityDao<ModelInfo> {
}
