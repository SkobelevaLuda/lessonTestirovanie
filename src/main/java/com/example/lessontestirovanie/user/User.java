package com.example.lessontestirovanie.user;

public class User {

    public static String login="Tanechka";
    public static String email = "Tanuchka@jhj.12";

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
        if(email.contains("@")&&email.contains(".")){
            return email;
        }else {
            return null;
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
