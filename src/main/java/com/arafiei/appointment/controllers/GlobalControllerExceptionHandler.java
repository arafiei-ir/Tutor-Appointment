package com.arafiei.appointment.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;
import java.security.InvalidParameterException;

@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(value = EntityNotFoundException.class)
    public void entityNotFoundExceptionHandler(HttpServletResponse response, EntityNotFoundException e) throws Exception{
        response.sendError(HttpServletResponse.SC_NOT_FOUND, e.getMessage());
    }

    @ExceptionHandler(value = InvalidParameterException.class)
    public void invalidParameterExceptionHandler(HttpServletResponse response, InvalidParameterException e) throws Exception{
        response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
    }
}