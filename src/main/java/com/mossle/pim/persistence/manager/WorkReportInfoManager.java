package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.WorkReportInfo;

@Service
public class WorkReportInfoManager extends HibernateEntityDao<WorkReportInfo> {
}
