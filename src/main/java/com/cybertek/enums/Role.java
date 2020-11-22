package com.cybertek.enums;

public enum Role {

    ADMIN("Admin"), MANAGER("Manager"), EMPLOYEE("Employee");

    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
