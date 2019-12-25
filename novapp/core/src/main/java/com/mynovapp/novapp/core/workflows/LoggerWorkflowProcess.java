package com.mynovapp.novapp.core.workflows;


import org.osgi.framework.Constants;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowData;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;

@Component (immediate=true, enabled=true, service = WorkflowProcess.class,
			property={
			        Constants.SERVICE_DESCRIPTION + "=Nov Logger Workflow Process Desc",
			        Constants.SERVICE_VENDOR + "=NovBatch",
			        "process.label=" + "November Logger Workflow Process"
			}
)
public class LoggerWorkflowProcess implements WorkflowProcess {

	private static Logger logger = LoggerFactory.getLogger(LoggerWorkflowProcess.class);

	@Override
	public void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap args) throws WorkflowException {
		logger.info("LoggerWorkflowProcess started !!!");
		WorkflowData workflowwData = workItem.getWorkflowData();
		String payloadPath = workflowwData.getPayload().toString();
		logger.info("LoggerWorkflowProcess: payloadPath:" + payloadPath);
		logger.info("LoggerWorkflowProcess ended !!!");
	}

	
	
	
	
}
