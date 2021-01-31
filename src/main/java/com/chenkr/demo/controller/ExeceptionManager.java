package com.chenkr.demo.controller;

import com.alibaba.fastjson.JSON;
import com.chenkr.demo.exception.FormException;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Map;

@RestControllerAdvice
public class ExeceptionManager {
    /**
     * Bind data to resp
     *
     * @param binder
     */
    public void initBinder(WebDataBinder binder) {

    }

    /**
     * Exception Handler
     * Global exception manage
     */
    @ExceptionHandler(FormException.class)
    public String errorHandler(FormException e) {
        Map<String, Object> resultMap = e.getFormErrInfo();
        resultMap.put("error", e.getMessage());
        resultMap.put("sucess", false);
        return JSON.toJSONString(resultMap);
    }


}
