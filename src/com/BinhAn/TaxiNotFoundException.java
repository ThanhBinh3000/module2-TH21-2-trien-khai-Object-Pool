package com.BinhAn;

import javax.management.RuntimeMBeanException;

public class TaxiNotFoundException extends RuntimeException {
    public TaxiNotFoundException(String message){
        System.out.println(message);
    }
}
