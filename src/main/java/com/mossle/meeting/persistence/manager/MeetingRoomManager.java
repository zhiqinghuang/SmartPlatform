package com.mossle.meeting.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.meeting.persistence.domain.MeetingRoom;

@Service
public class MeetingRoomManager extends HibernateEntityDao<MeetingRoom> {
}
