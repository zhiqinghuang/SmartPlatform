package com.mossle.bpm.cmd;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mossle.bpm.graph.ActivitiGraphBuilder;
import com.mossle.bpm.graph.Graph;

public class FindGraphCmd implements Command<Graph> {
	private String processDefinitionId;

	public FindGraphCmd(String processDefinitionId) {
		this.processDefinitionId = processDefinitionId;
	}

	public Graph execute(CommandContext commandContext) {
		return new ActivitiGraphBuilder(processDefinitionId).build();
	}
}