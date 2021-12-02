package variables;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int base;
		int altura;
		
		System.out.println("Introduce la base");
		base= in.nextInt();
		System.out.println("Introduce la altura");
		altura= in.nextInt();
		System.out.println("La superficie es"+base*altura);
		

	}

}
