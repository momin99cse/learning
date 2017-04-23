package com.practice.program;

public class primeTest {

	public static void main(String args[]) {
		for (int i = 3; i < 10; i++) {
			isPrime(i);
		}

	}

	public static void isPrime(int n) {

		int j = 0;
		final double l = Math.sqrt(n);
		for (int i = 2; i <= l; i++) {
			if (n % i == 0) {
				j = j + 1;
			}
		}

		if (j > 0) {
			System.out.println(n + " is not prime");
		} else {
			System.out.println(n + " prime");
		}
	}

}
