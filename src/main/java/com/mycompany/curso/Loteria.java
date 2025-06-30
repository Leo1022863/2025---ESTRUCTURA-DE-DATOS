/*Ejercicio 4
Escribir un programa que pregunte al usuario los números ganadores de la 
lotería primitiva, los almacene en una lista y los muestre por pantalla 
ordenados de menor a mayor.
*/



package com.mycompany.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Loteria {
    private List<Integer> numerosGanadores;
    private final int TOTAL_NUMEROS = 6;

    public Loteria() {
        numerosGanadores = new ArrayList<>();
    }

    public void capturarNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los " + TOTAL_NUMEROS + " números ganadores (entre 1 y 49):");

        while (numerosGanadores.size() < TOTAL_NUMEROS) {
            System.out.print("Número " + (numerosGanadores.size() + 1) + ": ");
            int numero = scanner.nextInt();

            if (numero >= 1 && numero <= 49 && !numerosGanadores.contains(numero)) {
                numerosGanadores.add(numero);
            } else {
                System.out.println("❌ Número inválido o repetido. Intenta de nuevo.");
            }
        }

        scanner.close();
    }

    public void mostrarNumerosOrdenados() {
        Collections.sort(numerosGanadores);
        System.out.println("\n🎉 Números ganadores ordenados:");
        for (int num : numerosGanadores) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea final
    }
}
