package com.mossle.pim.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.pim.persistence.domain.PimDevice;

@Service
public class PimDeviceManager extends HibernateEntityDao<PimDevice> {
}

//need to confirm