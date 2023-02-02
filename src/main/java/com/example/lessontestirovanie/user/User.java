package com.example.lessontestirovanie.user;

import java.util.Objects;

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

    public String getLogin() {
        return login;
    }

    public static String getEmail() {
        return email;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }
}
