package si;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1,num2;
		System.out.println("Introdice el primer numero");
		num1= in.nextInt();
		System.out.println("Introdice el segundo numero");
		num2= in.nextInt();
		num1=num2;
		if (num1 > 0)
			System.out.println("Hay dos numeros positivos");
		
		
	}

}
