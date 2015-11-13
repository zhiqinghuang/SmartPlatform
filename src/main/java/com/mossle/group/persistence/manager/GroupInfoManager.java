package com.mossle.group.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.group.persistence.domain.GroupInfo;

@Service
public class GroupInfoManager extends HibernateEntityDao<GroupInfo> {
}
