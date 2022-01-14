package org.example;

public class ifelse {

    public static void main(String[] args) {

        int x = 18;
        int y = 15;
        if (x > y) {
            System.out.println(x + " is greater than " + y);
        } else {
            System.out.println(x + "is less than " + y);
        }


        int age = 20;
        if (age < 18) {
            System.out.println(age + " years old is not eligible.");
        } else {
            System.out.println(age + " years is eligible.");
        }

        int ageNotEligible = 15;
        if (ageNotEligible < 18) {
            System.out.println(ageNotEligible + " years old is not eligible.");
        }
        else {
            System.out.println(ageNotEligible + " years is eligible.");
        }

        // Positive, negative and Zero program
        int number = -10;
        if (number > 0)
        {
            System.out.println(number + " is positive number.");
        }
        else if(number < 0) // -10 < 0
        {
            System.out.println(number + " is negative number.");
        }
        else if(number == 0) // -10 == 0
        {
            System.out.println("Number is " + number);
        }

        int evenNo = 4;
        if(evenNo%2 == 0) {
            System.out.println(evenNo + " is even number");
        }
        int odd = 7;
        if(odd%2 == 1)
         {
            System.out.println(odd + " is odd number");
        }
    }
}