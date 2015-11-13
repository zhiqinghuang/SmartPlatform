package com.mossle.cms.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.cms.persistence.domain.CmsAttachment;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CmsAttachmentManager extends HibernateEntityDao<CmsAttachment> {
}
