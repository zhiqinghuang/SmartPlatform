package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmConfNode;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmConfNodeManager extends HibernateEntityDao<BpmConfNode> {
}

//need to confirm