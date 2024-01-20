package com.learnjava.BanKan.exception;

public class BadRequestException extends RuntimeException{
   public BadRequestException(String message) {
        super(message);
   }
}
