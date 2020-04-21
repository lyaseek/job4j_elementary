package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User x : users) {
            if (x.getUsername().equals(login)) {
                return x;
            }
        }
        throw new UserNotFoundException("User with login " + login + " doesn't exist.");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((user.isValid()) && (user.getUsername().length() > 3)) {
            return true;
        } else {
            throw new UserInvalidException("User " + user.getUsername() + " is invalid.");
        }
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Ivan Sokolov", true),
                new User("Petr Petrov", false),
                new User("Anna Anton", true)
        };
        try {
            User user = findUser(users, "Petr Petrov");
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