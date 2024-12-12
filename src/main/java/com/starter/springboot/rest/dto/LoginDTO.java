package com.starter.springboot.rest.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginDTO {

    @NotNull
    @Size(min = 1, max = 10)
    private String mobileNumber;

    private Boolean rememberMe;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean isRememberMe() {
        return rememberMe;
    }

    public void setRememberMe(Boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "mobileNumber='" + mobileNumber + '\'' +
                ", rememberMe=" + rememberMe +
                '}';
    }
}
