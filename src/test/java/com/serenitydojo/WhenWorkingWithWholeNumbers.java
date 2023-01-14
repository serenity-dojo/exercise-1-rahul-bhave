package com.serenitydojo;
import org.junit.Test;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingTwoNumbersTogether() {
        int initialyear = 1995;
        int targetyear = 0;
        int timejump = 39;
        targetyear = initialyear + timejump;
        assertThat(targetyear, equalTo(2034));
    }

    @Test
    public void convertcelciustofahrenheit() {
        int celcius = 0;
        int fahrenheit = 0;
        int fahrenheitconversion = 32;
        int celciusconversion = 9;
        int celciusconversion2 = 5;
        fahrenheit = (celcius * celciusconversion / celciusconversion2) + fahrenheitconversion;
        assertThat(fahrenheit, equalTo(32));
    }

    @Test
    public static void main(String[] args) throws Exception {
        //1 kilograms = 2.20462262 pounds;
        BufferedReader bf = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("Enter the Kilogram:");
        int kilo = Integer.parseInt(bf.readLine());
        double pound = kilo * 2.20462262;
        System.out.println("Pounds: " + pound);
    }
}
