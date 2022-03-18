package defNotDefault;

import java.util.Scanner;

import paquete1.NumberFormatException;
import paquete1.String;

public class ScannerRamon {

	Scanner sc = new Scanner(System.in);
	
	public int nextInt(int a , int b ) {
		
		String entrada="";
		int numero=0;
		do {
			do {
				
				entrada = sc.nextLine();
			}while(!isNumeric(entrada));
			numero = Integer.valueOf(entrada);
			if (numero<a || numero>b) System.out.println("Numero fuera de rango");
		}while(numero<a || numero>b);
		
		return numero;
	}
	
	public static boolean isNumeric(String numero) {
		
		try {
			int num = Integer.valueOf(numero);
			return true;
		} catch (NumberFormatException e) {
			System.out.println("No has introducido un numero");
			return false;
			
		}
	}
}
