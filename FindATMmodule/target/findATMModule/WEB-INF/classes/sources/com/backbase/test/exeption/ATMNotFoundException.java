/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.backbase.test.exeption;

/**
 *
 * @author Omer Younus
 */
public class ATMNotFoundException extends Exception {
    
    public ATMNotFoundException() {
    }

    public ATMNotFoundException(String message) {
        super(message);
    }

    public ATMNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ATMNotFoundException(Throwable cause) {
        super(cause);
    }

    public ATMNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
