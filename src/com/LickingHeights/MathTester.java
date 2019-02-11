package com.LickingHeights;

public class MathTester {

        public static void main(String[] args) {
            String firstWord;
            String secondWord;
            int firstNumber, secondNumber;

            firstWord = "hot";
            secondWord = "dog";
            firstNumber = 2;
            secondNumber = 4;

            System.out.println(firstWord+secondWord);
            System.out.println(firstWord+firstNumber+secondNumber);
            System.out.println(secondWord+(firstNumber+secondNumber));
            System.out.println("The first number + the second number is "+(firstNumber+secondNumber));
            System.out.println("The second number - the first number is "+(secondNumber-firstNumber));
            System.out.println("The first word + the sum of the first number and second number is "+ firstWord+(firstNumber+secondNumber));
            System.out.println("The first number * the second number is "+firstNumber*secondNumber);
            System.out.println("The modulus of the second number by the first number is "+(secondNumber/firstNumber));
            System.out.println();


        }




}
