package lt.Ihu.unit04.main;

import java.util.Scanner;


public class Aufgabe2 {

	public static void main(String[] args) {
		int a, b, c, sum, min, max;
		
		a=inputFromConsole("Введите первое значение.");
		b=inputFromConsole("Введите второе значение.");
		c=inputFromConsole("Введите третье значение.");
		
		min=minnumber(a,b,c);
		max=maxnumber(a,b,c);
		
		sum=min+max;
		
		simplePrint(min,max,sum);
		
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
	public static int minnumber (int a, int b, int c) {
		int min;
		if ((a<b)&&(a<c)) {
			min=a;
			
		}else if((b<c)&&(b<a)) {
			min=b;
		}else {
			min=c;
		}
	return min;
	}
	public static int maxnumber (int a, int b, int c) {
		int max;
		if ((a>b)&&(a>c)) {
			max=a;
			
		}else if((b>c)&&(b>a)) {
			max=b;
		}else {
			max=c;
		}
	return max;
	}
	public static void simplePrint(double a, double b, double rez) {
		System.out.println("Сумма минимального и максимального"+a+" и"+b+"=" +rez);
	}

}
