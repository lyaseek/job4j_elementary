package ru.job4j.ex;

public class UserNotFoundException extends Exception {
    private String message;

    public UserNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
