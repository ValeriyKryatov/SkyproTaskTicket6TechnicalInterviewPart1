package org.example;

public class Main {

    // Напишите пример перехвата и обработки исключения в блоке try-catch-метода
    public static void main(String[] args) {

        try {
            User.check("safdsdfsd", "akjfhak");
            System.out.println("Введен корректный логин");
            System.out.println("Введен корректный пароль");
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}