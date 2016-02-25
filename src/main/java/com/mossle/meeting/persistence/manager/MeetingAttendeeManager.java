package com.mossle.meeting.persistence.manager;

import org.springframework.stereotype.Service;

import com.mossle.core.hibernate.HibernateEntityDao;
import com.mossle.meeting.persistence.domain.MeetingAttendee;

@Service
public class MeetingAttendeeManager extends HibernateEntityDao<MeetingAttendee> {
}

//need to confirm