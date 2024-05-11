package com.xxl.job.core.handler;

/**
 * 任务处理者上层接口
 *
 * @author xuxueli 2015-12-19 19:06:38
 */
public abstract class IJobHandler {


	/**
	 * 执行处理
	 * execute handler, invoked when executor receives a scheduling request
	 *
	 * @throws Exception
	 */
	public abstract void execute() throws Exception;


	/*@Deprecated
	public abstract ReturnT<String> execute(String param) throws Exception;*/

	/**
	 * 初始化
	 * init handler, invoked when JobThread init
	 */
	public void init() throws Exception {
		// do something
	}


	/**
	 * 销毁
	 * destroy handler, invoked when JobThread destroy
	 */
	public void destroy() throws Exception {
		// do something
	}


}
