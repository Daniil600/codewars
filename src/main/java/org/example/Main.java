package org.example;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Sum of odd numbers. Given the triangle of consecutive odd numbers:
        //Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
        //1 -->  1
        //2 --> 3 + 5 = 8
        SumOfOddNumbers sumOfOddNumbers = new SumOfOddNumbers();
        System.out.println(sumOfOddNumbers.rowSumOddNumbers(3));

        System.out.println("==============================");

        //Write a function that accepts an array of 10 integers (between 0 and 9),
        // that returns a string of those numbers in the form of a phone number.
        CreatePhoneNumber createPhoneNumber = new CreatePhoneNumber();
        System.out.println(createPhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 1}));

        System.out.println("==============================");

        //Write a function that takes an integer as input, and returns the number of bits
        // that are equal to one in the binary representation of that number. You can guarantee that input is non-negative.
        BitCounting bitCounting = new BitCounting();
        System.out.println(bitCounting.countBits(1234));

        System.out.println("==============================");

        //Deadfish has 4 commands, each 1 character long:
        //i increments the value (initially 0)
        //d decrements the value
        //s squares the value
        //o outputs the value into the return array
        System.out.println(Arrays.toString(DeadfishSwim.parse("iiisdoso")));

        System.out.println("==============================");

        System.out.println(BouncingBalls.bouncingBall(30.0, 0.66, 1.5));

    }
}
