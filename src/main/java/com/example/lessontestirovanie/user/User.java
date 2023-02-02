package com.example.lessontestirovanie.user;

public class User {

    public static String login;
    public static String email;

    public User(String login, String email) {
        if (login == null || login.isEmpty()) {
            System.out.println("Ведите значение");
        } else {
            this.login = login;
        }
        if (email == null || email.isEmpty()) {
            System.out.println("Введите корректное значение");
        } else {
            this.email = email;
        }
    }

    public User() {

    }

    public static String getLogin() {

        return login;
    }

    public static String getEmail() {
      return email;

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
