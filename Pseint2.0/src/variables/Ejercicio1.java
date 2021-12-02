
package variables;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Introduzca el primer numero");
		num1= in.nextInt();
		System.out.println("Introduce el segundo numero");
		num2= in.nextInt();
		System.out.println("El resultado es"+num1*num2);
	}

}
