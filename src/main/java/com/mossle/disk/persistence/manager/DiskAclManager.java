package com.mossle.disk.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.disk.persistence.domain.DiskAcl;

@Service
public class DiskAclManager extends HibernateEntityDao<DiskAcl> {
}

//need to confirm