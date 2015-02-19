package org.xllapp.app.demo;

import org.springframework.stereotype.Service;

import org.xllapp.app.core.OnceTask;

/**
 *
 *
 * @author dylan.chen Aug 3, 2013
 * 
 */
@Service
public class OnceTaskDemo extends OnceTask {

	@Override
	public void doTask() {
		 logger.debug("OnceTaskDemo.doTask()");
	}

}
