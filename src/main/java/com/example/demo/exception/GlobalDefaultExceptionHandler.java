package com.example.demo.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.net.ConnectException;
import java.net.UnknownHostException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalDefaultExceptionHandler.class);

    private static final String errorPage = "error";

    @ExceptionHandler(value = {ConnectException.class, UnknownHostException.class, ResourceAccessException.class})
    public ModelAndView
    connectionErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        String message = "Fail to establish connection to server !";
        logger.error(message+" url:"+req.getRequestURL());
        e.printStackTrace();
        return pageMessage(message);
    }

    @ExceptionHandler(value = ResponseStatusException.class)
    public ModelAndView
    responseStatusHandler(HttpServletRequest req, Exception e) throws Exception {
        String message = "Server Response status error !";
        logger.error("Server Response status error : " + e.getMessage());
        return pageMessage(message);
    }

    @ExceptionHandler(value = Exception.class)
    public ModelAndView
    defaultErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        String message = "Internal Error in getting sample !";
        logger.error(message);
        e.printStackTrace();
        return pageMessage(message+" Please contact support");
    }

    private ModelAndView pageMessage(String message){

        ModelAndView mav = new ModelAndView();
        mav.addObject("message", message);
        mav.setViewName(errorPage);
        return mav;

    }

}


