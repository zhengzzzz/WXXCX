package com.ikats.common.exception;



/**
 * @author shnejian26@hotmail.com
 * @date 2018/10/16 11:07
 */

public class IkatsException extends Exception {

    /**
     * 10-OMS错误
     * 15-WMS错误
     * 20-消息错误
     * 25-快递错误
     */
    public final static String OMS = "1000000";

    public final static String WMS = "1500000";

    public final static String MESSAGE = "2000000";

    public final static String EXPRESS = "2500000";

    /**
     * @Fields serialVersionUID :
     */
    private static final long serialVersionUID = 8970523354415436014L;
    private String resultContent;
    private String resultCode;

    public IkatsException(String resultContent) {
        this(resultContent,"100");
    }
    public IkatsException(String resultContent, String resultCode) {
        super();
        this.resultContent = resultContent;
        this.resultCode = Integer.valueOf(resultCode)<100?"100":resultCode;
    }


    public String getResultContent() {
        return resultContent;
    }

    public void setResultContent(String resultContent) {
        this.resultContent = resultContent;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public InvokerResult toInvokerResult(){
        InvokerResult invokerResult = new InvokerResult();
        invokerResult.setResultCode(this.resultCode);
        invokerResult.setResultContent(this.resultContent);
        return invokerResult;
    }

}