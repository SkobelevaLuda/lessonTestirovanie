package com.example.lessontestirovanie.tests;

import com.example.lessontestirovanie.user.User;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.regex.Matcher;

import static com.example.lessontestirovanie.user.User.*;
import static org.hamcrest.CoreMatchers.*;


public class UserTest {

    @Test
    public void getUser() {
        User user = new User("Tanya@123", "tanmmya@123ya.ru");
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
        Assertions.assertEquals(User.getEmail(),User.getLogin());
    }


}
