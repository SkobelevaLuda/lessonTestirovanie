package com.example.lessontestirovanie.user;

public class User {

    public static boolean check;
    private String login;
    private String email;

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

    public String getEmail() {
       // if(email.contains("@")&&email.contains(".")){
            return email;
        //}else {
         //   return null;
        //}
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
