/*
Ejercicio 5
Escribir un programa que almacene en una lista los números del 1 al 10
y los muestre por pantalla en orden inverso separados por comas.

*/



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecuenciaNumerica {
    private List<Integer> numeros;

    public SecuenciaNumerica() {
        numeros = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
    }

    public void mostrarInverso() {
        Collections.reverse(numeros);
        System.out.print("Numeros en orden inverso: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(); // Salto de línea final
    }
}

