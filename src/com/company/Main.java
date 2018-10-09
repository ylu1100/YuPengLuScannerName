package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What is your name?");
	String str = input.nextLine();
	System.out.println("Hello " + str + "! How are you?");
	System.out.println("How old are you " + str + "?");
	int i = input.nextInt();
	System.out.println(str + " is " + i + " years old!");// write your code here
    }
}
