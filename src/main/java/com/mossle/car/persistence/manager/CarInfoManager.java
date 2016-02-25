package com.mossle.car.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.car.persistence.domain.CarInfo;
import com.mossle.core.hibernate.HibernateEntityDao;

@Service
public class CarInfoManager extends HibernateEntityDao<CarInfo> {
}

//need to confirm