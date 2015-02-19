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
public class DelayScheduledTaskDemo extends ScheduledTask {

	@Override
	public long getDelay() {
		return 2000;
	}

	@Override
	public void doTask() {
        logger.debug("ScheduledTaskDemo.doTask()");
        try {
			Thread.sleep(1*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
