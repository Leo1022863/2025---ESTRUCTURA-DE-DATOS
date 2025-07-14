/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author LEO
 */
public class TorresHanoi {
     /**
     * Resuelve el problema de las Torres de Hanói de forma recursiva.
     *
     * @param n       El número de discos a mover.
     * @param origen  El nombre de la torre de origen (Ej: "Torre A").
     * @param destino El nombre de la torre de destino (Ej: "Torre C").
     * @param auxiliar El nombre de la torre auxiliar (Ej: "Torre B").
     */
    public void resolverHanoi(int n, String origen, String destino, String auxiliar) {
        // Caso base: Si solo hay un disco, muévelo directamente del origen al destino.
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
            return; // Termina la recursión para este caso
        }

        // Paso 1: Mover N-1 discos del origen a la torre auxiliar,
        // usando la torre de destino como auxiliar temporal.
        resolverHanoi(n - 1, origen, auxiliar, destino);

        // Paso 2: Mover el disco más grande (el disco N) de la torre de origen a la de destino.
        System.out.println("Mover disco " + n + " de " + origen + " a " + destino);

        // Paso 3: Mover los N-1 discos de la torre auxiliar a la torre de destino,
        // usando la torre de origen como auxiliar temporal.
        resolverHanoi(n - 1, auxiliar, destino, origen);
    }
    
}
