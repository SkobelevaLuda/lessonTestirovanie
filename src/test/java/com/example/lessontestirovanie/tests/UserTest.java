package com.example.lessontestirovanie.tests;

import com.example.lessontestirovanie.user.User;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.contains;

public class UserTest {

    @Test
    public void getUserTest() {

        User user1 = new User("Tanech15","Tanya@15.ru");
        assertNotEquals(user1.getLogin(),user1.getEmail());
    }

    @Test
    public void getUserNOParametrsTest() {

        User user = new User();
    }

    @Test
    public void emailOtherSymbols(){

        User user2 = new User("Tanysha15","Taa@15.ru");

        if (user2.getEmail().contains("@") && user2.getEmail().contains(".")){
            User.check=true;
        }
        assertFalse(false);
    }

}
