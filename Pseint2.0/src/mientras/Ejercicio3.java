package mientras;
import  java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double suma;
		int resultado;
		int numero = (int)(Math.random()*100+1);
		int numero2 = (int)(Math.random()*100+1);
		System.out.println(numero);
		System.out.println(numero2);
		resultado= scanner.nextInt();
		
		suma=numero+numero2;
		while((suma>resultado)||(suma<resultado)&& (suma==resultado)) {
			System.out.println("No es correcto");

		}
		
		System.out.println("Es correcto");

	}

}
