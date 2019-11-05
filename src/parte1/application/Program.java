package parte1.application;

import java.util.Scanner;

import parte1.service.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PrintService ps = new PrintService();

		System.out.print("How many values?  ");
		int N = sc.nextInt();

		for (int i =  0; i < N; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
	
		System.out.println("First: " + ps.first());

		sc.close();

	}
}
