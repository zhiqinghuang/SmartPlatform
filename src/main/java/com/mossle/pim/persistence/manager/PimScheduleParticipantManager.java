package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.PimScheduleParticipant;

@Service
public class PimScheduleParticipantManager extends HibernateEntityDao<PimScheduleParticipant> {
}

//need to confirm