package com.mossle.user.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.user.persistence.domain.PersonInfo;

@Service
public class PersonInfoManager extends HibernateEntityDao<PersonInfo> {
}
