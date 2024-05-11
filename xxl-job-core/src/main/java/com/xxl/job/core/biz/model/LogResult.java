package com.xxl.job.core.biz.model;

import java.io.Serializable;

/**
 * //日志结果
 * Created by xuxueli on 17/3/23.
 */
public class LogResult implements Serializable {
    private static final long serialVersionUID = 42L;

    public LogResult() {
    }
    public LogResult(int fromLineNum, int toLineNum, String logContent, boolean isEnd) {
        this.fromLineNum = fromLineNum;
        this.toLineNum = toLineNum;
        this.logContent = logContent;
        this.isEnd = isEnd;
    }

    //行数
    private int fromLineNum;
    //目标行数
    private int toLineNum;
    //日志内容
    private String logContent;
    //是否结束
    private boolean isEnd;

    public int getFromLineNum() {
        return fromLineNum;
    }

    public void setFromLineNum(int fromLineNum) {
        this.fromLineNum = fromLineNum;
    }

    public int getToLineNum() {
        return toLineNum;
    }

    public void setToLineNum(int toLineNum) {
        this.toLineNum = toLineNum;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }
}
