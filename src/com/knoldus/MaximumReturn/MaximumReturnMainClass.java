package com.knoldus.MaximumReturn;


import java.util.Scanner;

public class MaximumReturnMainClass{
    public static void main(String[] args) {

        // Lambda Expression for Return Maximum  integer values :
        MaximumReturnInterface result=(n1,n2) -> Math.max(n1,n2);
        Scanner sc = new Scanner(System.in);

        // User Input for Above function's Implementation
        System.out.println("Enter first Number: ");
        int x = sc.nextInt();

        System.out.println("\n Enter Second Number:");
        int y = sc.nextInt();

        // Showing Result of Maximum among 2 integers
        System.out.println("Maximum of above number is:");
        System.out.println(result.max(x,y));
    }
}
