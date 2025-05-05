package programas;

import java.util.Scanner;

public class Mayormenortres {

    public static void mayormenortres(){
        Scanner scannerNumeros = new Scanner(System.in);

        System.out.print("[n1]: ");
        double n1 = scannerNumeros.nextDouble();

        System.out.print("[n2]: ");
        double n2 = scannerNumeros.nextDouble();

        System.out.print("[n3]: ");
        double n3 = scannerNumeros.nextDouble();

        Double mayor = n1;
        if (n2 > mayor) {
        mayor = n2;
        }
        if (n3 > mayor) {
        mayor = n3;
        }

        Double menor = n1;
        if (n2 < menor) {
        menor = n2;
        if (n3 < menor) {
        menor = n3;
        }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        
        System.out.print("Enter para continuar");
        String continuar = scannerNumeros.nextLine();

        System.out.println("");

    }
    
}
