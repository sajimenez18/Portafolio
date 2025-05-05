package programas;

import java.util.Scanner;

public class Metrosacm {

    public static void metrosacm(){
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("[metros]: ");
        double m = scannerNumeros.nextDouble();

        System.out.println("[Re]: " + (m * 100 + "cm") ); 
        
        System.out.print("Enter para continuar");
        String continuar = scannerNumeros.nextLine();

        System.out.println("");

    }
    
}
