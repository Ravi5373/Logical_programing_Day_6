package Logical_programing_Day_6;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: 5");
		int n = sc.nextInt();
		

		int a = 0;
		int b = 1, c;

		System.out.println("value of a and b is: " + a + " " + b);

		System.out.println("Sum of fibonacci sries is:");

		for (int i = 0; i <= n; i++) {

			if (i < 1) {
				c = i;

			//	System.out.println(c);

			} else {
				c = a + b;
				a = b;
				b = c;
				
				
			}
			System.out.println(c);
		}
	}

}
