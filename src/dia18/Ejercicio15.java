package dia18;

public class Ejercicio15 {
}
    def calculadora():
        operando1 = int(input("Ingrese el primer operando: "))
        operando2 = int(input("Ingrese el segundo operando: "))
        signo = input("Ingrese el signo aritmético (+, -, x, :, /, %): ")

        if signo == '+':
        resultado = operando1 + operando2
        elif signo == '-':
        resultado = operando1 - operando2
        elif signo == 'x':
        resultado = operando1 * operando2
        elif signo == ':':
        resultado = operando1 / operando2
        elif signo == '/':
        resultado = operando1 // operando2
        elif signo == '%':
        resultado = operando1 % operando2
        else:
        print("Signo aritmético inválido.")
        return

        print("El resultado es:", resultado)
        
        calculadora()