package lt.Ihu.unit04.main;

import java.util.Scanner;

public class Aufgabe1 {

	public static void main(String[] args) {
		double a,b, gcd, NOK, pro;
		a=inputFromConsole("Введите первое значение.");
		b=inputFromConsole("Введите второе значение.");
		
		pro=product(a,b);
		gcd=nod(a,b);
		NOK=pro/gcd;
		simplePrint(a,b,NOK);
		simplePrint2(a,b,gcd);
	}
	public static double inputFromConsole(String message) {
		double value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод." + message);
		}
		value = sc.nextInt();
		return value;
	}
	public static double product (double a,double b) {
		double pro;
		pro = a*b;
		return pro;
	}
	public static double nod(double a, double b) {
		double gcd = 0;
		for (double i = 1; i <= a && i <= b; i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
		    }
		}
		return gcd ;
	}
	public static void simplePrint(double a, double b, double rez) {
		System.out.println("Наименьшее общее кратное чисел"+a+" и"+b+"=" +rez);
	}
	public static void simplePrint2(double a, double b, double rez) {
		System.out.println("Наибольший общий делитель чисел"+a+" и"+b+"=" +rez);
	}

}


