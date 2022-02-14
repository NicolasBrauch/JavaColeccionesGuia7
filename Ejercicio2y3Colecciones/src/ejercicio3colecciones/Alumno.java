package ejercicio3colecciones;

import java.util.ArrayList;

/*Crear una clase llamada Alumno que mantenga información sobre las notas de
distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de
tipo Integer con sus 3 notas*/
public class Alumno {

    //atributos
    public String nombre;
    public ArrayList<Integer> notas = new ArrayList();

    @Override
    public String toString() {
        return "nombre = " + nombre + ", notas = " + notas;
    }

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    /*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su
nota final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
Dentro del método se usará la lista notas para calcular el promedio final de alumno.
Siendo este promedio final, devuelto por el método y mostrado en el main.*/
    
    public int notaFinal() {
        int suma = 0;
        for (Integer unaNota : notas) {
            suma += unaNota;
        }
        return suma / 3;
    }

}
