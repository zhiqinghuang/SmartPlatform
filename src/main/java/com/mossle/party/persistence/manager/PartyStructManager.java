package com.mossle.party.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.party.persistence.domain.PartyStruct;

@Service
public class PartyStructManager extends HibernateEntityDao<PartyStruct> {
}

//need to confirm