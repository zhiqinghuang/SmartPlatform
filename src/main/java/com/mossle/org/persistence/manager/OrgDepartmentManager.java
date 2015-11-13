package com.mossle.org.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.org.persistence.domain.OrgDepartment;

@Service
public class OrgDepartmentManager extends HibernateEntityDao<OrgDepartment> {
}
