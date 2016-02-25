package com.mossle.meeting.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.meeting.persistence.domain.MeetingInfo;

@Service
public class MeetingInfoManager extends HibernateEntityDao<MeetingInfo> {
}

//need to confirm