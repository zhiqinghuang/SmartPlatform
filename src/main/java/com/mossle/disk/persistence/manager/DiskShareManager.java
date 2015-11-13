package com.mossle.disk.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.disk.persistence.domain.DiskShare;

@Service
public class DiskShareManager extends HibernateEntityDao<DiskShare> {
}
