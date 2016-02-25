package com.mossle.meeting.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.meeting.persistence.domain.MeetingItem;

@Service
public class MeetingItemManager extends HibernateEntityDao<MeetingItem> {
}

//need to confirm