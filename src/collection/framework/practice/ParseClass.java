package collection.framework.practice;

import java.util.Scanner;

public class ParseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String x="10";
		 * 
		 * int a=Integer.parseInt(x);
		 * 
		 * System.out.println(a);
		 */
		/*Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		;
		int c = input.nextInt();
		;

		if (a > b) {
			if (a > c) {
				System.out.println(a);
			} else {
				System.out.println(c);
			}

		} else {
			if (b > c) {
				System.out.println(b);
			} else {
				System.out.println(c);
			}
		}
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		
*/
		
		Scanner input = new Scanner(System.in);
		int v = input.nextInt();
		
		 

		switch (v) {

		case 1:
			System.out.println("1");
			break;

		case 10:
			System.out.println("10");
			break;
		default:
			System.out.println("nothing");
			break;

		}

	}

}
