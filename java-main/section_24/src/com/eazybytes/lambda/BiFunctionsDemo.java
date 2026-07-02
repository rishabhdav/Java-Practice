package com.eazybytes.lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiFunctionsDemo {

    public static void main(String[] args) {



        BiPredicate<Integer,Integer> isPrimeBoth = (num1, num2) -> {
            boolean isprime=false;


            return isprime;
        };

        BiFunction<Integer,String,String> change = (num1, num2) -> {
            StringBuilder builder=new StringBuilder();
            for(int i=0;i<num1;i++){
                builder.append(num2);
            }
            return builder.toString();
        };
       System.out.println(change.apply(5,"Rishabh"));

        BiFunction<Double,Double,Double> calculatePower = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePower.apply(2.0,3.0));


        BiConsumer<String,String> printString = (str,str2) -> {
            StringBuilder builder=new StringBuilder();
            builder.append(str);
            builder.append(str2);
            System.out.println(builder.toString().toUpperCase());
        };


        BiConsumer<String, String> employeeDetails = (firstName, lastName) -> {

            firstName = firstName.trim();
            lastName = lastName.trim();

            StringBuilder fullName = new StringBuilder();
            fullName.append(firstName);
            fullName.append(" ");
            fullName.append(lastName);

            String name = fullName.toString();

            System.out.println("Employee Details");
            System.out.println("-----------------------------");
            System.out.println("Full Name : " + name);
            System.out.println("Uppercase : " + name.toUpperCase());
            System.out.println("Lowercase : " + name.toLowerCase());

            int totalLength = name.replace(" ", "").length();
            System.out.println("Total Characters : " + totalLength);

            int vowels = 0;
            int consonants = 0;

            for (char ch : name.toLowerCase().toCharArray()) {

                if (Character.isLetter(ch)) {

                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                    } else {
                        consonants++;
                    }
                }
            }

            System.out.println("Vowels : " + vowels);
            System.out.println("Consonants : " + consonants);

            String reversed = new StringBuilder(name).reverse().toString();
            System.out.println("Reversed Name : " + reversed);

            if (firstName.length() > lastName.length()) {
                System.out.println("First name is longer.");
            } else if (firstName.length() < lastName.length()) {
                System.out.println("Last name is longer.");
            } else {
                System.out.println("Both names have equal length.");
            }

            System.out.println("\nCharacters in Full Name:");

            for (int i = 0; i < name.length(); i++) {
                System.out.println(i + " -> " + name.charAt(i));
            }

            System.out.println("\nProcessing Completed Successfully.");
        };
        printString.accept("Rishabh","Rishabh");






























        BiConsumer<String, String> appendAndConvert = (word1, word2) ->
                    System.out.println((word1+word2).toUpperCase());
        appendAndConvert.accept("Hello ", "Eazy Bytes");

        BiConsumer<String, String> appendAndLength = (word1, word2) ->
                System.out.println((word1+word2).length());
        appendAndLength.accept("Hello ", "Eazy Bytes");

        BinaryOperator<Double> calculatePowerWithBO = (num1, num2) -> Math.pow(num1, num2);
        System.out.println(calculatePowerWithBO.apply(5.0,2.0));

        BinaryOperator<Integer> maxOperation = BinaryOperator.maxBy((a,b) -> Integer.compare(a,b));
        System.out.println(maxOperation.apply(16,30));

        BinaryOperator<Integer> minOperation = BinaryOperator.minBy((a,b) -> Integer.compare(a,b));
        System.out.println(minOperation.apply(16,30));

    }

}
