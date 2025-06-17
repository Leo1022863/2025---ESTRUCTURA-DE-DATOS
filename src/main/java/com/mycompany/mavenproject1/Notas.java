
package com.mycompany.mavenproject1;

public class Notas {
    
    //ATRIBUTOS
        
        //Vector
    private String[] estudiantes;
    
        //Matriz
    private int[][] calificaciones; 
    
    //CONSTRUCTOR
    
    public Notas() {
    }
    
    // METODOS

    //SETTERS Y GETTERS
    public String[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public int[][] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[][] calificaciones) {
        this.calificaciones = calificaciones;
    }

    
    
    public void mostrarNotas(){
        
        for (int i = 0; i < estudiantes.length; i++) {
            
            System.out.println(estudiantes[i]);
            for (int j = 0; j < calificaciones.length; j++) {
                
                System.out.println(calificaciones[i][j]);
                
            }
        }
    }
    
    
}
