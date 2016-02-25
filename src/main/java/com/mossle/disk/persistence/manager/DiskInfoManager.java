package com.mossle.disk.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.disk.persistence.domain.DiskInfo;

@Service
public class DiskInfoManager extends HibernateEntityDao<DiskInfo> {
}

//need to confirm