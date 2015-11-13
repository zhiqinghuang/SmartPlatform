package com.mossle.workcal.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.workcal.persistence.domain.WorkcalPart;

@Service
public class WorkcalPartManager extends HibernateEntityDao<WorkcalPart> {
}
