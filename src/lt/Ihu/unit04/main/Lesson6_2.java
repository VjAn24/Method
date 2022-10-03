package lt.Ihu.unit04.main;

import java.math.BigInteger;
import java.util.Scanner;

public class Lesson6_2 {

	public static void main(String[] args) {
	
		try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            String number = scanner.nextLine();
            BigInteger result = new BigInteger(number);
            System.out.println("Enter the second number: ");
            number = scanner.nextLine();
            result = result.add(new BigInteger(number));
            System.out.println(result);
        }
	}

}
