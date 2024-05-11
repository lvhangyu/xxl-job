package com.xxl.job.core.biz;

import com.xxl.job.core.biz.model.*;

/**
 * 执行者biz接口定义
 * Created by xuxueli on 17/3/1.
 */
public interface ExecutorBiz {

    /**
     * 打
     * beat
     * @return
     */
    public ReturnT<String> beat();

    /**
     * 空闲节拍
     * idle beat
     *
     * @param idleBeatParam
     * @return  返回任务状态 是否在运行或排队中
     */
    public ReturnT<String> idleBeat(IdleBeatParam idleBeatParam);

    /**
     * run
     * @param triggerParam
     * @return
     */
    public ReturnT<String> run(TriggerParam triggerParam);

    /**
     * kill
     * @param killParam
     * @return
     */
    public ReturnT<String> kill(KillParam killParam);

    /**
     * log
     * @param logParam
     * @return
     */
    public ReturnT<LogResult> log(LogParam logParam);

}
