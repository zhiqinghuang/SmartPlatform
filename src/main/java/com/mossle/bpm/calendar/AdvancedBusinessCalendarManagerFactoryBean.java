package com.mossle.bpm.calendar;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import com.mossle.api.workcal.WorkCalendarConnector;

public class AdvancedBusinessCalendarManagerFactoryBean implements InitializingBean, FactoryBean<AdvancedBusinessCalendarManager> {
	private AdvancedBusinessCalendarManager advancedBusinessCalendarManager;
	private WorkCalendarConnector workCalendarConnector;

	public AdvancedBusinessCalendarManager getObject() {
		return advancedBusinessCalendarManager;
	}

	public Class<AdvancedBusinessCalendarManager> getObjectType() {
		return AdvancedBusinessCalendarManager.class;
	}

	public boolean isSingleton() {
		return true;
	}

	public void afterPropertiesSet() throws Exception {
		this.advancedBusinessCalendarManager = new AdvancedBusinessCalendarManager();
		this.addBusinessCalendar(new DueDateBusinessCalendar());
		this.addBusinessCalendar(new DurationBusinessCalendar());
		this.addBusinessCalendar(new CycleBusinessCalendar());
	}

	public void addBusinessCalendar(AdvancedBusinessCalendar businessCalendar) {
		businessCalendar.setWorkCalendarConnector(workCalendarConnector);
		this.advancedBusinessCalendarManager.addBusinessCalendar(businessCalendar);
	}

	public void setWorkCalendarConnector(WorkCalendarConnector workCalendarConnector) {
		this.workCalendarConnector = workCalendarConnector;
	}
}

//need to confirm