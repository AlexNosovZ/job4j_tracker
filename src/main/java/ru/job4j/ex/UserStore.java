package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User tmp : users) {
            if (login.equals(tmp.getUsername())) {
                user = tmp;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("user " + login + " not found");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid()) {
            if (user.getUsername().length() < 3) {
                throw new UserInvalidException(user.getUsername() + "is not valid");
            }
        } else {
            throw new UserInvalidException(user.getUsername() + " is not valid");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            System.out.println(ei.getMessage());
        } catch (UserNotFoundException ef) {
            System.out.println(ef.getMessage());
        }
    }
}
