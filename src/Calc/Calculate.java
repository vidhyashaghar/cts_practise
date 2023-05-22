package Calc;

import java.util.Scanner;

public class Calculate {

	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Select the Option");
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		Integer opt = ip.nextInt();
		switch (opt) {
		case 1:
			add();
			break;
		case 2:
			sub();
			break;
		case 3:
			mul();
			break;
		case 4:
			div();
			break;

		}

	}

	private static int[] getVariable() {
		System.out.println("Enter two Numbers");
		int[] num = new int[2];
		num[0] = ip.nextInt();
		num[1] = ip.nextInt();
		return num;
	}

	private static void div() {
		int[] num = getVariable();
		System.out.println("Division of " + num[0] + " and " + num[1] + " is " + (num[0] / num[1]));
	}

	private static void sub() {
		int[] num = getVariable();
		System.out.println("Subraction of " + num[0] + " and " + num[1] + " is " + (num[0] - num[1]));

	}

	private static void mul() {
		int[] num = getVariable();
		System.out.println("Multiplication of " + num[0] + " and " + num[1] + " is " + (num[0] * num[1]));

	}

	private static void add() {
		int[] num = getVariable();
		System.out.println("Addition of " + num[0] + " and " + num[1] + " is " + (num[0] + num[1]));
	}

}
