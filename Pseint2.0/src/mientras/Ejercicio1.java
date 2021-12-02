package mientras;
import  java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner(System.in);
		int pass=0;
		int intentos=1;
		int maximo=3;
			
				while((pass!=1234)&& (intentos<maximo)){
					
					
					System.out.print("Introduzca su pass:");
					pass=teclado.nextInt();
					
					if(intentos==3){
						System.out.println("acceso denegado..");
						intentos=intentos-maximo;
					}
				
					intentos++;
					
				
				
				
			}
			
			
			System.out.println("Pass correcta");
			
	}

}
