import java.util.Scanner;

import programas.Sumar;
import programas.Opciones;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
          vistas.vista.banner();
          programas.Opciones.opciones();

            System.out.println("[0] Salir");
            System.out.println("[?]");
            System.out.println();

            opcion = scanner.nextInt();

            // Opciones
            switch (opcion) {
                case 1:
                System.out.println("Ingresa dos numeros para realizar su suma");
                  programas.Sumar.suma();
                    break;

                case 2:
                System.out.println("Ingresa dos numeros para realizar su resta");
                  programas.Resta.resta();
                    break;

                case 3:
                System.out.println("Ingresa dos numeros para realizar su multiplicacion");
                  programas.Multiplicacion.multiplicacion();
                    break;

                case 4:
                System.out.println("Ingresa dos numeros para realizar su division");
                  programas.Division.division();
                    break;

                case 5:
                System.out.println("Ingresa dos numeros para encontrar su modulo");
                  programas.Modulo.modulo();
                    break;

                case 6:
                System.out.println("Ingresa tres numeros para encontrar su promedio");
                  programas.Promedio.promedio();
                    break;

                case 7:
                    System.out.println("Ingresa dos numeros para calcular el número mayor y menor");
                  programas.Mayormenordos.mayormenordos();
                        break;     

                case 8:
                    System.out.println("Ingresa tres numeros para calcular el número mayor y menor");
                    programas.Mayormenortres.mayormenortres();
                        break;          
                case 9:
                        System.out.println("Conversión de metros a centímetros");
                        System.out.println("Ingresa los metros");
                          programas.Metrosacm.metrosacm();
                            break;

                case 10:
                        System.out.println("Conversión de kilogramos a gramos");
                        System.out.println("Ingresa los kg");
                            programas.Kilogramosag.kilogramosag();
                            break;
                        
                default:
                    break;
            }

        } while (opcion != 0);

    }
}