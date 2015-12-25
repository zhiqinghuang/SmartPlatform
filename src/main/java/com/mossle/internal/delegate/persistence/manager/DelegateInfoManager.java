package com.mossle.internal.delegate.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.delegate.persistence.domain.DelegateInfo;

@Service
public class DelegateInfoManager extends HibernateEntityDao<DelegateInfo> {
}
