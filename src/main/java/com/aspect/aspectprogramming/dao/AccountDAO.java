package com.aspect.aspectprogramming.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + " doing saving account to DB.");
    }
}
