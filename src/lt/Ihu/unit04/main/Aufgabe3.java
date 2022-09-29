package lt.Ihu.unit04.main;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		int a,b,c,d;
		
		a=inputFromConsole("Введите первое значение.");
		b=inputFromConsole("Введите второе значение.");
		
		c=denken(a);
		d=denken(b);
		
		if (c<d) {	
			simplePrint(b);
		}else {
			simplePrint(a);
		}
	}
	public static int inputFromConsole(String message) {
		int value;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while(!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод." + message);
		}
		value = sc.nextInt();
		return value;
	}
	public static int denken(int a) {
		int rez=0;
		while (a!=0) {
			a=a/10;
			rez++;
		}
		return rez;
	}
	public static void simplePrint(int a) {
		System.out.println("Число"+a+" содержит больше цифр");
	}

}
