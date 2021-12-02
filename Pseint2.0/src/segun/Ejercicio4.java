package segun;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    int mes;
	
	    System.out.println("El programa te devuelve el mes seleccionando:");
	    System.out.println("1.- Enero.");
	    System.out.println("2.- Febrero.");
	    System.out.println("3.- Marzo.");
	    System.out.println("4.- Abril.");
	    System.out.println("5.- Mayo.");
	    System.out.println("6.- Junio.");
	    System.out.println("7.- Julio.");
	   mes = scanner.nextInt();
	
	    switch (mes) {
	    case 1:
	      System.out.println("El mes seleccionado es Enero");
	      break;
	    case 2:
	      System.out.println("El mes seleccionado es Febrero");
	      break;
	    case 3:
	      System.out.println("El mes seleccionado es Marzo");
	      break;
	    case 4:
	      System.out.println("El mes seleccionado es Abril");
	      break;
	    case 5:
	      System.out.println("El mes seleccionado es Mayo");
	      break;
	    case 6:
	      System.out.println("El mes seleccionado es Junio");
	      break;
	    case 7:
	      System.out.println("El mes seleccionado es Julio");
	      break;
	    default:
	      System.out.println("ERROR: no hay este mes.");
	    }
	}

}
