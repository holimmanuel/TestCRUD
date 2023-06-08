package com.testcrud.testcerud.exception;


import org.springframework.http.HttpStatus;

public class BlogException {

    private final String message;
    private final String throwble;
    private final String httpStatus;


    public BlogException(String message, Throwable throwble, HttpStatus httpStatus) {
        this.message = message;
        this.throwble = throwble;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }
    public String getThrowble() {
        return throwble;
    }
    public String getHttpStatus() {
        return httpStatus;
    }


}
