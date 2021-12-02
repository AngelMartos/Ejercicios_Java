package mientras;
import  java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num1,num2;
		double suma;
		System.out.println("Introduce el primer numero");
		num1= scanner.nextInt();
		System.out.println("Introduce el segundo numero");
		num2= scanner.nextInt();
		suma=num1+num2;
		while((suma>0)&& (suma==0)) {
			System.out.println("El resultado es"+suma);
		}
		System.out.println("Se acabo");
		
		

	}

}
