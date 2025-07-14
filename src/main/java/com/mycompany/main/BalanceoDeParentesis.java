/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.Stack;

/**
 *
 * @author LEO
 */
public class BalanceoDeParentesis {
    
     /**
     * Verifica si los paréntesis, llaves y corchetes en una expresión matemática
     * están correctamente balanceados.
     *
     * @param expresion La cadena de texto que contiene la expresión matemática.
     * @return true si la expresión está balanceada, false en caso contrario.
     */
    public static boolean estaBalanceada(String expresion) {
        Stack<Character> pila = new Stack<>();

        for (char caracter : expresion.toCharArray()) {
            if (caracter == '(' || caracter == '{' || caracter == '[') {
                pila.push(caracter); // Si es un paréntesis de apertura, lo metemos a la pila
            } else if (caracter == ')' || caracter == '}' || caracter == ']') {
                if (pila.isEmpty()) {
                    return false; // Si la pila está vacía y encontramos un paréntesis de cierre, está desbalanceado
                }
                char topePila = pila.pop(); // Sacamos el elemento superior de la pila

                // Verificamos si el paréntesis de cierre coincide con el de apertura en la pila
                if (caracter == ')' && topePila != '(') {
                    return false;
                }
                if (caracter == '}' && topePila != '{') {
                    return false;
                }
                if (caracter == ']' && topePila != '[') {
                    return false;
                }
            }
            // Otros caracteres (números, operadores, espacios) son ignorados
        }

        // Si la pila está vacía al final, significa que todos los paréntesis de apertura
        // tuvieron su correspondiente paréntesis de cierre.
        return pila.isEmpty();
    }
    
}
