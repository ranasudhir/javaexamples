package com.javaexamples.day1;

import java.util.Scanner;

public class AreaOfCircle 
{
	public static void main(String[] args)
	{
		float AOC, r;
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter a value for radius r:");
		r=scan.nextFloat();
		AOC=3.14f*(r*r);
		System.out.println("The Area of Circle is: " + AOC);
	}
}