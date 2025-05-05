package programas;

import java.util.Scanner;

public class Mayormenordos {

    public static void mayormenordos(){
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannerNumeros.nextDouble();

        if (n1 > n2) {
            System.out.println(" El numero mayor es: " + n1 + " y el numero menor es: " + n2);
          }
          if (n1 < n2) {
            System.out.println(" El numero mayor es: " + n2 + " y el numero menor es: " + n1);
          }
          if (n1 == n2) {
            System.out.println("Ambos numeros son iguales");
          }
        
        System.out.print("Enter para continuar");
        String continuar = scannerNumeros.nextLine();

        System.out.println("");

    }
    
}
