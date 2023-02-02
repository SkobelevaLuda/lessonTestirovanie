package com.example.lessontestirovanie.tests;

import com.example.lessontestirovanie.user.User;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class UserTest {

    @Test
    public void getUser() {
        User user1 = new User();
    }

    @Test
    public void getUserNOParametrs() {

        User user = new User();
    }

    @Test
    public void getCorrectedEmail() {
        MatcherAssert.assertThat(User.getEmail(), CoreMatchers.containsString("@"));
    }

    @Test
    public void getEqulsLoginEmail() {
        Assertions.assertNotEquals(User.getEmail(),User.getLogin());
    }


}
