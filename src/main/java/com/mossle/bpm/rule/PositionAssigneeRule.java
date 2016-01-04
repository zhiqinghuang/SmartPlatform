package com.mossle.bpm.rule;

import java.util.List;

import com.mossle.api.org.OrgConnector;
import com.mossle.core.spring.ApplicationContextHelper;

/**
 * 获得部门最接近的对应的岗位的人的信息.
 * 
 */
public class PositionAssigneeRule implements AssigneeRule {

	public List<String> process(String value, String initiator) {
		return ApplicationContextHelper.getBean(OrgConnector.class).getPositionUserIds(initiator, value);
	}

	public String process(String initiator) {
		return null;
	}
}