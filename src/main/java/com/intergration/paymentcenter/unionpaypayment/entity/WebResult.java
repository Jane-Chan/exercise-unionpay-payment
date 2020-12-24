package com.intergration.paymentcenter.unionpaypayment.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Webservice接口通用返回结果类。
 *
 * @author Duncan
 */
public final class WebResult {
    private boolean isSucceeded = false;
    private String errorCode = "";
    private String errorMessage = "";
    private Object result = "";


    private String dateTime = this.getCurrentDateTime();

    private String getCurrentDateTime() {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return format.format(new Date());
    }

    private static final Logger logger = LoggerFactory.getLogger(WebResult.class);

    public WebResult() {
    }

    public WebResult(boolean isSucceeded, String errorCode,
                     String errorMessage, Object result) {
        this.isSucceeded = isSucceeded;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.result = result;

    }

    public WebResult(boolean isSucceeded,
                     Object result) {
        super();
        this.isSucceeded = isSucceeded;
        this.result = result;

    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isSucceeded() {
        return isSucceeded;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Object getResult() {
        return result;
    }

    public void setSucceeded(boolean isSucceeded) {
        this.isSucceeded = isSucceeded;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public void setResult(Object result) {
        this.result = result;
    }


}
