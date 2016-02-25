package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.PimInfo;

@Service
public class PimInfoManager extends HibernateEntityDao<PimInfo> {
}

//need to confirm