package com.xxl.job.core.biz.model;

import java.io.Serializable;

/**
 * 日志参数
 * @author xuxueli 2020-04-11 22:27
 */
public class LogParam implements Serializable {
    private static final long serialVersionUID = 42L;

    public LogParam() {
    }
    public LogParam(long logDateTim, long logId, int fromLineNum) {
        this.logDateTim = logDateTim;
        this.logId = logId;
        this.fromLineNum = fromLineNum;
    }

    //日志时间
    private long logDateTim;
    //任务id
    private long logId;
    //行数
    private int fromLineNum;

    public long getLogDateTim() {
        return logDateTim;
    }

    public void setLogDateTim(long logDateTim) {
        this.logDateTim = logDateTim;
    }

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }

    public int getFromLineNum() {
        return fromLineNum;
    }

    public void setFromLineNum(int fromLineNum) {
        this.fromLineNum = fromLineNum;
    }

}