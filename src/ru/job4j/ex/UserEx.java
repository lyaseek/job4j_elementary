package ru.job4j.ex;

public class UserEx {

    private String username;
    private boolean valid;

    public UserEx(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}