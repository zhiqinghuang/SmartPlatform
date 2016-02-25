package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.WorkReportAttachment;

@Service
public class WorkReportAttachmentManager extends HibernateEntityDao<WorkReportAttachment> {
}

//need to confirm