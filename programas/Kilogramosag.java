package programas;

import java.util.Scanner;

public class Kilogramosag {

    public static void kilogramosag(){
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("[kg]: ");
        double kg = scannerNumeros.nextDouble();

        System.out.println("[Re]: " + (kg * 1000 + "g") ); 
        
        System.out.print("Enter para continuar");
        String continuar = scannerNumeros.nextLine();

        System.out.println("");

    }
    
}

