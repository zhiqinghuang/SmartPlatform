package com.mossle.party.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.party.persistence.domain.PartyStructType;

@Service
public class PartyStructTypeManager extends HibernateEntityDao<PartyStructType> {
}
