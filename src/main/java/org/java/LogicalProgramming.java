package org.java;

public class LogicalProgramming {
	
	static String checkPrimeNumber(int a) {
		int b = 0;
		for (int i = 2; i < a; i++) {
			if (a%i==0) {
				b++;
				break;
				
			}
			
		}
		if (b==0) {
			return"prime no";
			
		} else {
			return "not a prime no";

		}
		
	}
	static int reverseNumber(int a) {
		int rev = 0;
		while (a>0) {
			int b = a/10;
			int c = a%10;
			rev = c + (rev*10);
			a = b;
			
		}
		return rev;

	}
	static String polindromeNumber(int a) {
		int rev = 0;
		int temp = 0;
		while (a>0) {
			int b = a/10;
			int c = a%10;
			rev = c + (rev*10);
			a=b;
			
		}
		if (temp==rev) {
			return "polindrome num";
			
		} else {
			return "non polindrome num";

		}
	}
	static int countOfDigits(int a) {
		int count = 0;
		while (a>0) {
			int b = a/10;
			int c = a%10;
			count++;
			a=b;
			
		}
		return count;
	}
	static int sumOfDigits(int a) {
		int sum = 0;
		while (a>0) {
			int b = a/10;
			int c = a%10;
			sum = sum+c;
			a=b;
			
		}
		return sum;
	}
	private void reverseString(String input) {
		
	}
	public static void main(String[] args) {
		String checkPrimeNumber = checkPrimeNumber(157);
		System.out.println(checkPrimeNumber);
		
		int reverseNumber = reverseNumber(654321);
		System.out.println(reverseNumber);
		
		String polindromeNumber = polindromeNumber(234565432);
		System.out.println(polindromeNumber);
		
		int countOfDigits = countOfDigits(123);
		System.out.println(countOfDigits);
		
		int sumOfDigits = sumOfDigits(4567);
		System.out.println(sumOfDigits);
		
		
		
		
		
	}
//	
}
