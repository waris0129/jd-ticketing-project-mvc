package com.cybertek.enums;

public enum Gender {

    MALE("Male"),FEMAL("Female");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }


}
