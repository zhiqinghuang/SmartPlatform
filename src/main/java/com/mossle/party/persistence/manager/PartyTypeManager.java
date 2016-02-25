package com.mossle.party.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.party.persistence.domain.PartyType;

@Service
public class PartyTypeManager extends HibernateEntityDao<PartyType> {
}

//need to confirm