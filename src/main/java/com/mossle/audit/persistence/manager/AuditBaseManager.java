package com.mossle.audit.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.audit.persistence.domain.AuditBase;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class AuditBaseManager extends HibernateEntityDao<AuditBase> {
}
