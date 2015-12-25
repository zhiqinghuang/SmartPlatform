package com.mossle.humantask.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.humantask.persistence.domain.HtParticipant;

@Service
public class HtParticipantManager extends HibernateEntityDao<HtParticipant> {
}
