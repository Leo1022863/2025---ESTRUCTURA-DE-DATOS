/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author LEO
 */
public class Main {

    public static void main(String[] args) {
   
        /*EJERCICIO 1 */
        
         // Ejemplos de expresiones para probar la funcionalidad
        String expresion1 = "{7 + (8 * 5) - [(9 - 7) + (4 + 1)]}";
        String expresion2 = "(2+{3[-4(5)5]-1}10)";
        String expresion3 = "({[()])"; // Desbalanceada
        String expresion4 = "{[}]"; // Desbalanceada
        String expresion5 = "(()"; // Desbalanceada
        String expresion6 = "()[]{}";
        String expresion7 = "abc(123)xyz{5}"; // Con otros caracteres

        // Imprimir los resultados utilizando la clase BalanceoDeParentesis
        System.out.println("Expresion: " + expresion1 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion1) ? "Formula balanceada." : "Formula desbalanceada."));
        System.out.println("Expresion: " + expresion2 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion2) ? "Formula balanceada." : "Formula desbalanceada."));
        System.out.println("Expresion: " + expresion3 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion3) ? "Formula balanceada." : "Formula desbalanceada."));
        System.out.println("Expresion: " + expresion4 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion4) ? "Formula balanceada." : "Formula desbalanceada."));
        System.out.println("Expresion: " + expresion5 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion5) ? "Formula balanceada." : "Formula desbalanceada."));
        System.out.println("Expresion: " + expresion6 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion6) ? "Formula balanceada." : "Formula desbalanceada."));
        System.out.println("Expresion: " + expresion7 + " -> " + (BalanceoDeParentesis.estaBalanceada(expresion7) ? "Formula balanceada." : "Formula desbalanceada."));
    
       
        /*EJERCICIO 2 */
        
        TorresHanoi juego = new TorresHanoi();
        int numDiscos = 3; // Puedes cambiar el número de discos aquí

        System.out.println("--- Resolviendo las Torres de Hanoi con " + numDiscos + " discos ---");
        juego.resolverHanoi(numDiscos, "Torre A", "Torre C", "Torre B");
        System.out.println("--- Proceso completado ---");
        
    }
}
