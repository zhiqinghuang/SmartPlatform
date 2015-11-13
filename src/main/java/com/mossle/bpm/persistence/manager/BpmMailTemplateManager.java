package com.mossle.bpm.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.bpm.persistence.domain.BpmMailTemplate;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class BpmMailTemplateManager extends HibernateEntityDao<BpmMailTemplate> {
}
