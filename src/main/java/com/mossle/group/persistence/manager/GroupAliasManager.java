package com.mossle.group.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.group.persistence.domain.GroupAlias;

@Service
public class GroupAliasManager extends HibernateEntityDao<GroupAlias> {
}

//need to confirm