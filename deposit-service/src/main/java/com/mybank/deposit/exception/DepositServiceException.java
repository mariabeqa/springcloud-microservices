package com.mybank.deposit.exception;

public class DepositServiceException extends RuntimeException{

    public DepositServiceException(String msg) {
        System.out.println(msg);
    }
}
