package com.mossle.workcal.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.workcal.persistence.domain.WorkcalType;

@Service
public class WorkcalTypeManager extends HibernateEntityDao<WorkcalType> {
}
