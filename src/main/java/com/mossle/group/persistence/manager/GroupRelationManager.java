package com.mossle.group.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.group.persistence.domain.GroupRelation;

@Service
public class GroupRelationManager extends HibernateEntityDao<GroupRelation> {
}
