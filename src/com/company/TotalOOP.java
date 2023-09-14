package com.company;
import java.util.Scanner;
public class TotalOOP{
    public static void main(String[] args) {
        System.out.println("Total for two marks entered by the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mark ");
        int mark1 = sc.nextInt();
        System.out.println("Enter mark ");
        int mark2 = sc.nextInt();
        System.out.println("Enter mark ");
        int mark3 = sc.nextInt();
        int sum = mark2 + mark1 + mark3;
        double average = sum / 3;
        System.out.print("The total for " + mark1);
        System.out.print(", " + mark2 + " and ");
        System.out.println(mark3 + " is " + sum);
        System.out.println("The average for these marks is " + average);
    }

    }

