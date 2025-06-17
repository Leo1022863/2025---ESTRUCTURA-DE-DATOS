/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author LEO
 */
public class SemanaTres {

    public static void main(String[] args) {
        
        Notas notas= new Notas();
        
        String[] estudiantes={"Pedro","Juan","Darwin","Sofia"};
        
        int[][] calificaciones={{8,6,5},{7,8,9},{10,10,9}};
        
        notas.setEstudiantes(estudiantes);
        notas.setCalificaciones(calificaciones);
    }
}
