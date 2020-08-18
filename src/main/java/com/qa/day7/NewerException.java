package com.qa.day7;

public class NewerException extends Exception{
    public NewerException(String errorMessage){
        super(errorMessage);
    }
    public NewerException(String errorMessage, Throwable error){
        super(errorMessage, error);
    }
}
