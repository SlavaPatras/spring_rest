package com.zaurtregulov.spring.rest.exception_handling;

public class NullSuchEmployeeException extends RuntimeException{
    public NullSuchEmployeeException(String message) {
        super(message);
    }
}
