import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Scanner teclado = new Scanner (System.in);
		System.out.println("ingrese palabra");
		String palabra = teclado.next() ;
		String palabrap = "" ;
	    for (int i= palabra.length()-1; i>=0;i--) {
	        palabrap += palabra.charAt(i);
	           
	    }	
	    if(palabra.equalsIgnoreCase(palabrap)) {
     		System.out.print("Es un palíndromo");
 	    }
	    else {
	    	System.out.print("No es un palíndromo");
	    }
	}

}
