package dia18;

import java.util.Scanner;

/*
*@author Alan Vera
*@version 1.0
*
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer operando: ");
        int operando1 = scanner.nextInt();
        System.out.print("Ingrese el segundo operando: ");
        int operando2 = scanner.nextInt();
        System.out.print("Ingrese el signo aritmético (+, -, x, :, /, %): ");
        String signo = scanner.next();

        int resultado = 0;
        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "x":
                resultado = operando1 * operando2;
                break;
            case ":":
                resultado = operando1 / operando2;
                break;
            case "/":
                resultado = operando1 / operando2;
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                    System.out.println("Signo aritmético inválido.");
                return;
        }

           System.out.println("El resultado es: " + resultado);
    }
}