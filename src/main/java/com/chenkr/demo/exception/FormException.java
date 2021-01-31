package com.chenkr.demo.exception;


import java.util.HashMap;
import java.util.Map;

public class FormException extends BaseException {
    Map<String, Object> formErrInfo;

    public FormException(String message, Throwable cause) {
        super(message);
        formErrInfo = new HashMap<>();
        formErrInfo.put("formKey", cause.getCause().getMessage().split(" ")[5].replace("'", ""));
    }

    public Map<String, Object> getFormErrInfo() {
        return formErrInfo;
    }
}
