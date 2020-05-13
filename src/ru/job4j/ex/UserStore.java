package ru.job4j.ex;

public class UserStore {
    public static UserEx findUser(UserEx[] users, String login) throws UserNotFoundException {
        for (UserEx x : users) {
            if (x.getUsername().equals(login)) {
                return x;
            }
        }
        throw new UserNotFoundException("User with login " + login + " doesn't exist.");
    }

    public static boolean validate(UserEx user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("User " + user.getUsername() + " is invalid.");
        }
        return true;
    }

    public static void main(String[] args) {
        UserEx[] users = {
                new UserEx("Petr Arsentev", true),
                new UserEx("Ivan Sokolov", true),
                new UserEx("Petr Petrov", false),
                new UserEx("Anna", true)
        };
        try {
            UserEx user = findUser(users, "");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException e) {
            System.out.println(e.getMessage());
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}