package com.hellosteve.springjwt.model;

public class AuthenticationResponse {
    private String message;

    public AuthenticationResponse(String meassage) {
        this.message = meassage;
    }

    public String getToken() {
        return message;
    }
}
