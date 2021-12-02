package si;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1,num2;
		System.out.println("Introduce el primer numero");
		num1=in.nextInt();
		System.out.println("Introduce el segundo numero");
		num2=in.nextInt();
		if (num2==0)
			System.out.println("No valido");
		else
			System.out.println("El resultado de la division es"+ num1/num2);
		
		

	}

}
