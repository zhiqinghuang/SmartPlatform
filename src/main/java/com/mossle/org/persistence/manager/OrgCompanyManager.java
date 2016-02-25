package com.mossle.org.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.org.persistence.domain.OrgCompany;

@Service
public class OrgCompanyManager extends HibernateEntityDao<OrgCompany> {
}

//need to confirm