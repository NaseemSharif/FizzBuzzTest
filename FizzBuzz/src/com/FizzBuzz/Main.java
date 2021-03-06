package com.FizzBuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("FizzBuzz");
        System.out.print("Please Enter a Number: ");
        int fizzBuzz = scanner.nextInt();

        if (fizzBuzz % 5 == 0 && fizzBuzz % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if(fizzBuzz % 5 == 0){
            System.out.println("Fizz");
        }
        else if (fizzBuzz % 3 == 0){
            System.out.println("Buzz");
        }
        else System.out.println(fizzBuzz + " divided by 5 or 3 is not a whole number");
        System.out.println("The result");
    }
}
