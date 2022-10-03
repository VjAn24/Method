package lt.Ihu.unit04.main;

import java.util.Scanner;


public class Lesson6_1 {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		a=inputFromConsole("Введите первое значение");
		b=inputFromConsole("Введите второе значение");
		c=inputFromConsole("Введите третье значение");
		
		d=prufung(a,b);
		e=prufung(a,c);
		f=prufung(b,c);
		
		simplePrint(d, e, f);
		
	}
	public static int inputFromConsole(String message) {
		int x;
		Scanner scr=new Scanner(System.in);
		System.out.println(message);
		while (!scr.hasNextDouble()) {
			scr.nextLine();
			System.out.println("Неверный ввод"+message);
		}
		x=scr.nextInt();
		return x;
	}
	public static int prufung(int a, int b) {
		int temp=1;
		if ((a!=b)&&(a>b)) {
			while(1<=b) {
				temp=a%b;
				a=b;
				b=temp;
			}
		} else {
			while(1<=a) {
				temp=b%a;
				b=a;
				a=temp;
			}
		}
		return a;	
	}
	public static void simplePrint(int a, int b, int c) {
		if ((a==b)&&(b==c)) {
			System.out.println("Данное числа является взаимно простым");
		} else {
			System.out.println("Данное числа не является взаимно простым");
		}
	}
	
}
