package si;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Introduce el primer numero");
		num1= scanner.nextInt();
		
		System.out.println("Introduce el segundo numero");
		num2= scanner.nextInt();
		
		if (num2==num1)
			System.out.println("Los numeros son iguales");
		else
			System.out.println("Los numeros no son iguales");
		
		
	}

}
