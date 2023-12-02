package org.example;

public class User {

    public static void check(String login, String password) throws WrongLoginException, WrongPasswordException {
        if (login.length() > 10) {
            throw new WrongLoginException("Введенный логин не может быть длиннее 10 символов");
        }
        if (password.length() > 10) {
            throw new WrongPasswordException("Введенный пароль не может быть длиннее 10 символов");
        }
    }
}
