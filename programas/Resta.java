package programas;

import java.util.Scanner;

public class Resta {

    public static void resta(){
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannerNumeros.nextDouble();

        System.out.println("[Re]: " + (n1-n2) ); 
        
        System.out.print("Enter para continuar");
        String continuar = scannerNumeros.nextLine();

        System.out.println("");

    }
    
}
