package Operaciones;

import java.util.Scanner;

public class Clase_Padre {

    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void Datos() {

        System.out.print(" Ingrese el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.println("");

        System.out.print(" Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();

    }

    public void Imprimir() {

        System.out.print(resultado);
    }
}
