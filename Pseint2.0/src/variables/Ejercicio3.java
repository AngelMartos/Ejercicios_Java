package variables;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final double PI = 3.146;
		double area;
		int radio;
		System.out.println("Introduce el radio del circulo");
		radio= in.nextInt();
		area= PI*radio*radio;
		System.out.println("La superficie es"+area);
	}

}
