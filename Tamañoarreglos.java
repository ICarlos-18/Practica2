package Practica2;

import java.util.Scanner;

public class Tamañoarreglos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamano = scanner.nextInt();

            int[] arreglo = new int[tamano];

            System.out.println("Ingrese los valores del arreglo:");
            for (int i = 0; i < tamano; i++) {
                System.out.print("Valor " + (i + 1) + ": ");
                arreglo[i] = scanner.nextInt();
            }

            int maximo = arreglo[0];
            for (int i = 1; i < tamano; i++) {
                if (arreglo[i] > maximo) {
                    maximo = arreglo[i];
                }
            }

            int minimo = arreglo[0];
            for (int i = 1; i < tamano; i++) {
                if (arreglo[i] < minimo) {
                    minimo = arreglo[i];
                }
            }

            int impares = 0;
            for (int i = 0; i < tamano; i++) {
                if (arreglo[i] % 2 != 0) {
                    impares++;
                }
            }

            int pares = tamano - impares;

            System.out.println("El valor máximo en el arreglo es: " + maximo);
            System.out.println("El valor mínimo en el arreglo es: " + minimo);
            System.out.println("Cantidad de valores impares en el arreglo: " + impares);
            System.out.println("Cantidad de valores pares en el arreglo: " + pares);
        }
    }
}