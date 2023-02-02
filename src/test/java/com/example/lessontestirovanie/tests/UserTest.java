package com.example.lessontestirovanie.tests;

import com.example.lessontestirovanie.user.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static com.example.lessontestirovanie.user.User.email;
import static com.example.lessontestirovanie.user.User.login;

public class UserTest {

    @Test
    public void getUser() {

        User user1 = new User("Tanya123", "tanmmya@123ya.ru");

    }

    @Test
    public void getUserNOParametrs() {

        User user = new User();
    }

    @Test
    public void getCorrectedEmail() {
       Assertions.(email.contains("@") && (email.contains("."))) {
        }
    }

    @Test
    public void getEqulsLoginEmail() {
        Assertions.assertEquals(login, email);
    }


}
