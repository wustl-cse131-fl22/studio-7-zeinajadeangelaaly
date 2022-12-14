package studio7;

import java.util.Scanner;

public class Fraction {
	private int numerator;
	private int denominator;
	
	
	public Fraction(int numerator, int denominator) {
		numerator = 0;
		denominator = 0;
	}

	public void addFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
		numerator = numerator1 * denominator2 + numerator2 * denominator1;
		denominator = denominator1 * denominator2;
	}
	
	public void multiFraction(int numerator1, int denominator1, int numerator2, int denominator2) {
		numerator = numerator1 * numerator2;
		denominator = denominator1 * denominator2;
	}
	public void recFraction(int newNumerator, int newDenominator) {
		numerator = newDenominator;
		denominator = newNumerator;
	}
	public void simpFraction(int numerator, int denominator) {
		
	}
	
	public String toString() {
		return "Result = " + numerator + "/" + denominator;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("what is the fraction?");
		int numerator1 = in.nextInt();
		int denominator1 = in.nextInt();
		Fraction fraction1 = new Fraction(numerator1, denominator1);
		System.out.println("type of operation: 1.add 2.multiply 3.reciprocal 4.simpilfy");
		int Operation = in.nextInt();
		if(Operation == 1) {
			System.out.println("what is the second fraction?");
			int numerator2 = in.nextInt();
			int denominator2 = in.nextInt();
			fraction1.addFraction(numerator1, denominator1, numerator2, denominator2);
		}else if(Operation == 2) {
			System.out.println("what is the second fraction?");
			int numerator2 = in.nextInt();
			int denominator2 = in.nextInt();
			fraction1.multiFraction(numerator1, denominator1, numerator2, denominator2);
		}else if(Operation == 3) {
			fraction1.recFraction(numerator1, denominator1);
		}else if(Operation == 4) {
			fraction1.simpFraction(numerator1, denominator1);
		}
		System.out.println(fraction1.toString());
	}
	
}
