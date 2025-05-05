package programas;

import java.util.Scanner;

public class Sumar {

    public static void suma(){
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannerNumeros.nextDouble();

        System.out.println("[Re]: " + (n1+n2) ); 
        
        System.out.print("Enter para continuar");
        String continuar = scannerNumeros.nextLine();

        System.out.println("");

    }
    
}
