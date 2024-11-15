package com.asiimwe;

public class Login {
    public boolean authenticate(String username, String password) {
        return "user".equals(username) && "password".equals(password);
    }
}
