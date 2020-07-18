package division;

import java.util.Scanner;/*libreria para pedir datos de teclado*/


public class divisiones {

    public static void main(String[] args) {

        try {
            //codigo que se ejecuta de manera inicial
            int valor1, valor2, resultado;

            Scanner entrada = new Scanner(System.in);

            System.out.print("ingrese valor 1: ");
            valor1 = entrada.nextInt();
            System.out.print("ingrese valor 2: ");
            valor2 = entrada.nextInt();

            resultado = valor1 / valor2;
            System.out.print("division: " + resultado);
        } catch (Exception e) {
            //comportamiento del programa ante el error
            System.out.println("error : " + e);
        } finally {
            System.out.println("gracias por dividir con enzo´s program");
        }
        /*el finally ejecuta un bloque de codigo sin importar el resultado del programa*/
        System.out.println("probando el nuevo servicio");
    }
}
