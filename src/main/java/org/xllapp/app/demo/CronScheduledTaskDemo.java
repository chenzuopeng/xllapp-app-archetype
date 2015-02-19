package org.xllapp.app.demo;

import org.springframework.stereotype.Service;

import org.xllapp.app.core.ScheduledTask;

/**
 *
 *
 * @author dylan.chen Aug 3, 2013
 * 
 */
@Service
public class CronScheduledTaskDemo extends ScheduledTask {
	
	@Override
	public String getCron() {
		return "0/5 * * * * *";
	}

	@Override
	public void doTask() {
        logger.debug("ScheduledTaskDemo.doTask()");
	}

}
