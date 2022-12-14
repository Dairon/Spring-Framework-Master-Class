package com.in28minutes.spring.basics.springin5steps.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness {
    @Inject
    SomeCdiDao someCdiDao;

    public SomeCdiDao getSomeCdiDao(){
        return someCdiDao;
    }

    public void setSomeCdiDao(SomeCdiDao someCdiDao){
        this.someCdiDao = someCdiDao;
    }
}
