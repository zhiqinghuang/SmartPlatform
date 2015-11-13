package com.mossle.form.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.form.persistence.domain.FormTemplate;

@Service
public class FormTemplateManager extends HibernateEntityDao<FormTemplate> {
}
