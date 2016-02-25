package com.mossle.msg.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.msg.persistence.domain.MsgInfo;

@Service
public class MsgInfoManager extends HibernateEntityDao<MsgInfo> {
}

//need to confirm