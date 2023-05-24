package org.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreatePhoneNumber {

    public static String createPhoneNumber(int[] numbers) {
        //check for length
        if(numbers.length != 10){
            return "0";
        }
        //check for < 0
        if(Arrays.stream(numbers).sorted().min().getAsInt()<0){
            return "-1";
        }

        //transform to String
        String str = Arrays.toString(numbers);
        //delete '[',']' and ',' after converter to String
        str = str.replaceAll("[^0-9]", "");

        //Creat patern for checks
        Pattern pattern = Pattern.compile("([0-9]{10})");
        Matcher matcher = pattern.matcher(str);
        System.out.println(str);

        if (matcher.matches()) {
            // handle the situation when the string matches the pattern
            // returns "(123) 456-7890"
            return String.format("(%s) %s-%s", str.substring(0,3), str.substring(3, 6), str.substring(6));
        }
        else {
            return "some not correct";
        }
    }

}
