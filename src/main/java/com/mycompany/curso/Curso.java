/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

/**
 *
 * @author LEO
 */

//////////////////////////////////////////////////////////////////////////////////////////////////////

/*
public class Curso {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        List<Asignatura> asignaturas = new ArrayList<>();

        // Añadimos las asignaturas al curso
        asignaturas.add(new Asignatura("Matematicas"));
        asignaturas.add(new Asignatura("Fisica"));
        asignaturas.add(new Asignatura("Quimica"));
        asignaturas.add(new Asignatura("Historia"));
        asignaturas.add(new Asignatura("Lengua"));

        // Mostramos las asignaturas por pantalla
        System.out.println("Asignaturas del curso:");
        for (Asignatura a : asignaturas) {
            System.out.println("- " + a.getNombre());
        }
    }
}
*/



//////////////////////////////////////////////////////////////////////////////////////////////////////


/*public class Curso {
    public static void main(String[] args) {
        // Crear la lista de asignaturas
        List<Asignatura> asignaturas = new ArrayList<>();

        // Agregar asignaturas al curso
        asignaturas.add(new Asignatura("Matematicas"));
        asignaturas.add(new Asignatura("Fisica"));
        asignaturas.add(new Asignatura("Quimica"));
        asignaturas.add(new Asignatura("Historia"));
        asignaturas.add(new Asignatura("Lengua"));

        // Mostrar el mensaje para cada asignatura
        for (Asignatura a : asignaturas) {
            a.mostrarMensaje();
        }
    }
}
*/

//////////////////////////////////////////////////////////////////////////////////////////////////////

/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Curso {
    public static void main(String[] args) {
        // Crear lista de asignaturas
        List<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(new Asignatura("Matematicas"));
        asignaturas.add(new Asignatura("Fisica"));
        asignaturas.add(new Asignatura("Quimica"));
        asignaturas.add(new Asignatura("Historia"));
        asignaturas.add(new Asignatura("Lengua"));

        // Crear scanner para ingreso de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar nota por cada asignatura
        for (Asignatura a : asignaturas) {
            System.out.print("Que nota has sacado en " + a.getNombre() + "? ");
            double nota = scanner.nextDouble();
            a.setNota(nota);
        }

        // Mostrar resultados
        System.out.println("\nResumen de notas:");
        for (Asignatura a : asignaturas) {
            System.out.println("En " + a.getNombre() + " has sacado " + a.getNota());
        }

        scanner.close();
    }
}
*/

//////////////////////////////////////EJERCICIO 4 -LOTERIA ////////////////////////////////////////////////////////////////


/*
public class Curso {
    public static void main(String[] args) {
        Loteria loteria = new Loteria();
        loteria.capturarNumeros();
        loteria.mostrarNumerosOrdenados();
    }
}
*/

//////////////////////////////////////EJERCICIO 5 - SECUENCIA ////////////////////////////////////////////////////////////////

public class Curso {
    public static void main(String[] args) {
        SecuenciaNumerica secuencia = new SecuenciaNumerica();
        secuencia.mostrarInverso();
    }
}










