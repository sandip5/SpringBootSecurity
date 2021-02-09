package com.sandip.springsecurityjwt.springsecurityjwt.models;

public class AuthenticationRequest {
    private String UserName;
    private String password;

    public AuthenticationRequest(String userName, String password) {
        UserName = userName;
        this.password = password;
    }

    public AuthenticationRequest() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
