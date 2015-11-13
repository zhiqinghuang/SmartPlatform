package com.mossle.group.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.group.persistence.domain.GroupType;

@Service
public class GroupTypeManager extends HibernateEntityDao<GroupType> {
}
