package com.example.somethingback.domain.user;

import io.micrometer.common.util.StringUtils;

public class Email {
    private String email;

    private Email(String email) {
        if(validation(email)){

        }
        this.email = email;
    }

    public static Email of(String email){
        return new Email(email);
    }

    public String getEmail() {
        return email;
    }

    public String value(){
        return email;
    }
    public boolean validation(String email){
        if(StringUtils.isBlank(email)) return false;
        if(!email.contains("@")) return false;
        String[] emailSet = email.split("@");
        return emailSet.length == 2;
    }
}
