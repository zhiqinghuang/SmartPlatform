package com.mossle.internal.template.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.internal.template.persistence.domain.TemplateInfo;

@Service
public class TemplateInfoManager extends HibernateEntityDao<TemplateInfo> {
}
