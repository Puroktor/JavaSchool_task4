package ru.dataart.academy.java;

public class TooBigInputException extends IllegalArgumentException{
    public TooBigInputException() {
    }

    public TooBigInputException(String s) {
        super(s);
    }

    public TooBigInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooBigInputException(Throwable cause) {
        super(cause);
    }
}
