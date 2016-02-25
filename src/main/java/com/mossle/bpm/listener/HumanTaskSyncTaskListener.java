package com.mossle.bpm.listener;

import javax.annotation.Resource;

import org.activiti.engine.delegate.DelegateTask;

import com.mossle.api.humantask.HumanTaskConnector;
import com.mossle.api.humantask.HumanTaskDTO;
import com.mossle.bpm.support.DefaultTaskListener;

public class HumanTaskSyncTaskListener extends DefaultTaskListener {
	private static final long serialVersionUID = 1550610147340801738L;
	public static final int TYPE_COPY = 3;
	private HumanTaskConnector humanTaskConnector;

	@Override
	public void onCreate(DelegateTask delegateTask) throws Exception {
		HumanTaskDTO humanTaskDto = humanTaskConnector.findHumanTaskByTaskId(delegateTask.getId());
		delegateTask.setOwner(humanTaskDto.getOwner());
		delegateTask.setAssignee(humanTaskDto.getAssignee());
	}

	@Resource
	public void setHumanTaskConnector(HumanTaskConnector humanTaskConnector) {
		this.humanTaskConnector = humanTaskConnector;
	}
}
//need to confirm