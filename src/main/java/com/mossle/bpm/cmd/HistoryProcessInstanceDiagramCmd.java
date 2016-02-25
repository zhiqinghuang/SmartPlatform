package com.mossle.bpm.cmd;

import java.io.InputStream;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;

import com.mossle.bpm.util.CustomProcessDiagramGenerator;

public class HistoryProcessInstanceDiagramCmd implements Command<InputStream> {
	protected String historyProcessInstanceId;

	public HistoryProcessInstanceDiagramCmd(String historyProcessInstanceId) {
		this.historyProcessInstanceId = historyProcessInstanceId;
	}

	public InputStream execute(CommandContext commandContext) {
		try {
			CustomProcessDiagramGenerator customProcessDiagramGenerator = new CustomProcessDiagramGenerator();

			return customProcessDiagramGenerator.generateDiagram(historyProcessInstanceId);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
}

//need to confirm