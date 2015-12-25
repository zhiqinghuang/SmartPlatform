package com.mossle.internal.store.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.store.persistence.domain.StoreInfo;

@Service
public class StoreInfoManager extends HibernateEntityDao<StoreInfo> {
}
