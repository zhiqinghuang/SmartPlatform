package com.mossle.auth.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.auth.persistence.domain.Menu;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class MenuManager extends HibernateEntityDao<Menu> {
}
