package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.PimNote;

@Service
public class PimNoteManager extends HibernateEntityDao<PimNote> {
}
