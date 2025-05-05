import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do{
            
            System.out.println("  *******  *************  **********    **********   *          *    ********                 ");
            System.out.println("  *              *        *             *        *   *          *    *                        ");
            System.out.println("  *              *        *             *        *   *          *    *                        ");
            System.out.println("  *******        *        *******       **********   ************    ********                 ");
            System.out.println("        *        *        *             *            *          *           *                 ");
            System.out.println("        *        *        *             *            *          *           *                 ");
            System.out.println("  *******        *        **********    *            *          *    ********                 ");


            //

            System.out.println("[1] Suma de dos números");
            System.out.println("[2] Resta de dos números");
            System.out.println("[3] Multiplicación de dos números");
            System.out.println("[4] División de dos números");
            System.out.println("[5] Módulo (Residuo de una división)");
            System.out.println("[6] Promedio de tres números");
            System.out.println("[7] Número mayor y menor entre dos números");
            System.out.println("[8] Número mayor y menor entre tres números");
            System.out.println("[9] Conversión de metros a centímetros");
            System.out.println("[10] Conversión de kilogramos a gramos");

            opcion = scanner.nextInt();

            // Opciones
            switch (opcion) {
                case 1:
                System.out.println("Ingresa dos numeros para realizar su suma");
                  int n1 = scanner.nextInt();
                  int n2 = scanner.nextInt();
                  int respuesta = n1 + n2;
                  System.out.println("La respuesta es: " + respuesta);
                    break;

                case 2:
                System.out.println("Ingresa dos numeros para realizar su resta");
                  int n3 = scanner.nextInt();
                  int n4 = scanner.nextInt();
                  int resultado = n3 - n4;
                  System.out.println("La respuesta es: " + resultado);
                    break;

                case 3:
                System.out.println("Ingresa dos numeros para realizar su multiplicacion");
                  int n5 = scanner.nextInt();
                  int n6 = scanner.nextInt();
                  int respuEsta = n5 * n6;
                  System.out.println("La respuesta es: " + respuEsta);
                    break;

                case 4:
                System.out.println("Ingresa dos numeros para realizar su division");
                  int n7 = scanner.nextInt();
                  int n8 = scanner.nextInt();
                  int respuestA = n7 / n8;
                  System.out.println("La respuesta es: " + respuestA);
                    break;

                case 5:
                System.out.println("Ingresa dos numeros para encontrar su modulo");
                  Double n9 = scanner.nextDouble();
                  Double n10 = scanner.nextDouble();
                  Double Respuesta = n9 % n10;
                  System.out.println("La respuesta es: " + Respuesta);
                    break;

                case 6:
                System.out.println("Ingresa tres numeros para encontrar su promedio");
                  int n11 = scanner.nextInt();
                  int n12 = scanner.nextInt();
                  int n13 = scanner.nextInt();
                  int rEspuesta = (n11 + n12 + n13)/3;
                  System.out.println("La respuesta es: " + rEspuesta);
                    break;

                case 7:
                    System.out.println("Ingresa dos numeros para calcular el número mayor y menor");
                      Double n14 = scanner.nextDouble();
                      Double n15 = scanner.nextDouble();

                      if (n14 > n15) {
                        System.out.println(" El numero mayor es: " + n14 + " y el numero menor es: " + n15);
                      }
                      if (n14 < n15) {
                        System.out.println(" El numero mayor es: " + n15 + " y el numero menor es: " + n14);
                      }
                      else {
                        System.out.println("Ambos numeros son iguales");
                      }
                        break;     

                case 8:
                    System.out.println("Ingresa tres numeros para calcular el número mayor y menor");
                        Double n16 = scanner.nextDouble();
                        Double n17 = scanner.nextDouble();
                        Double n18 = scanner.nextDouble();

                        Double mayor = n16;
                        if (n17 > mayor) {
                        mayor = n17;
                        }
                        if (n18 > mayor) {
                        mayor = n18;
                        }

                        Double menor = n16;
                        if (n17 < menor) {
                        menor = n17;
                        if (n18 < menor) {
                        menor = n18;
                        }
                        }

                        System.out.println("El numero mayor es: " + mayor);
                        System.out.println("El numero menor es: " + menor);

                        break;          
                case 9:
                        System.out.println("Conversión de metros a centímetros");
                        System.out.println("Ingresa los metros");
                          int metros = scanner.nextInt();
                          int centímetros = metros * 100;
                          System.out.println(metros + " metros equivalen a " + centímetros + " centimetros" );
                            break;

                case 10:
                        System.out.println("Conversión de kilogramos a gramos");
                        System.out.println("Ingresa los kg");
                            int kilogramos = scanner.nextInt();
                            int gramos = kilogramos * 1000;
                            System.out.println(kilogramos + " kilogramos equivalen a " + gramos + " gramos" );
                            break;
                        
                default:
                    break;
            }

        } while (opcion != 0);

    }
}