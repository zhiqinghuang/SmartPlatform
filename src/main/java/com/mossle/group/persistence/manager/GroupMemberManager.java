package com.mossle.group.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.group.persistence.domain.GroupMember;

@Service
public class GroupMemberManager extends HibernateEntityDao<GroupMember> {
}

//need to confirm