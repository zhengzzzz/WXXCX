package com.ikats.common.exception;

import java.io.Serializable;

/**
 * 调用结果
 * @author shnejian26@hotmail.com
 * @date 2018/9/28 10:04
 */

public final class InvokerResult implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 状态 1 代表成功 其他代表失败
     */
    private String resultCode = "1";

    private Object resultData = "";

    private String resultContent = "";

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }
}