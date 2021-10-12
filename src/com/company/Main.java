package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight as an int in pounds");
        int pounds = scanner.nextInt();
        System.out.println("Your weight in kilograms is " + pounds*2.2 + " kilograms");
        double mars = (pounds/9.81)*3.711;
        System.out.println("Your weight on Mars is " + mars + " pounds or " + mars*2.2 + " kilograms");
    }
}
