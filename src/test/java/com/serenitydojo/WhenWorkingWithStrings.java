package com.serenitydojo;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithStrings {
    @Test
    public void convertingtolowercase() {
        String name = "Serenity";
        String lowercase = name.toLowerCase();
        assertThat(lowercase, equalTo("serenity"));
    }

    @Test
    public void convertingtouppercase() {
        String name = "Serenity";
        String uppercase = name.toUpperCase();
        assertThat(uppercase, equalTo("SERENITY"));
    }
    @Test
    public void trimwhitespace() {
        String name = " Serenity ";
        String trim = name.trim();
        assertThat(trim, equalTo("Serenity"));
    }

    @Test
    public void findlength() {
        String name = "Serenity";
        int length = name.length();
        assertThat(length, equalTo(8));
    }

    @Test
    public void replace() {
        String name = "hello world";
        String replace = name.replace("hello world", "hello Serenity");
        assertThat(replace, equalTo("hello Serenity"));
    }


}

