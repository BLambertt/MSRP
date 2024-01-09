package com.msrp.demo.api.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.UTFDataFormatException;

@ControllerAdvice
public class UtilisateurNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(UTFDataFormatException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String utilisateurNotFoundHelper(UTFDataFormatException ex)
    {
        return ex.getMessage();
    }
}
