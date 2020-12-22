/**
 * Copyright © 2020, Glodon Digital Supplier & Purchaser BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.job.test002.executor;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * 示例
 *
 * @author Leon
 * @date 2020-12-22 15:19
 */
@Component
public class ExampleXxlJob
{

	private static Logger logger = LoggerFactory.getLogger(ExampleXxlJob.class);

	/**
	 * 1、简单任务示例（Bean模式）
	 */
	@XxlJob("test002")
	public ReturnT<String> demoJobHandler(String param) throws Exception
	{
		XxlJobLogger.log("XXL-JOB, test002    Hello World.");

		for (int i = 0; i < 5; i++)
		{
			TimeUnit.SECONDS.sleep(1);
		}
		System.out.println("test002 task finished.");
		return ReturnT.SUCCESS;
	}
}
