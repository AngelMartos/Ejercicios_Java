package si;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num1;
		System.out.println("Introduce el numero");
		num1= in.nextInt();
		if (num1 > 0)
			System.out.println("Es mayor o igual que cero");
		else 
			System.out.println("Es negativo");
		if (num1==0)
			System.out.println("Es mayor o igual que cero");
		else 
			System.out.println("Es negativo");
	}
	

}
