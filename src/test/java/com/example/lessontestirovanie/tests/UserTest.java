package com.example.lessontestirovanie.tests;

import com.example.lessontestirovanie.user.User;
import org.junit.Test;

public class UserTest {

    @Test
    public void getUser() {

        User user = new User("Tanya123", "tanya@123ya.ru");
    }
    @Test
    public void getUserNOParametrs() {

        User user = new User("Tanya123", "tanya@123ya.ru");
    }


}
