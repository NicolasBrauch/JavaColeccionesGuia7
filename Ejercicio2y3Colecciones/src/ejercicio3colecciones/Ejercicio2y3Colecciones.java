package ejercicio3colecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;


public class Ejercicio2y3Colecciones {

    /*En el main deberemos tener un bucle que crea un objeto Alumno. Se pide toda la
información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion = 0;
        String elementoabuscar = "";
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese el nombre: ");
            alumno.nombre = leer.next();
            System.out.println("Ingree las 3 notas: ");
            for (int i = 0; i < 3; i++) {
                alumno.notas.add(leer.nextInt());
            }

            listaAlumnos.add(alumno);

            System.out.println("Quiere crear otro alumno: ");
            System.out.println("1)Si");
            System.out.println("2)No");
            opcion = leer.nextInt();
            if (opcion == 2) {

                for (Alumno unAlumno : listaAlumnos) {
                    System.out.println(unAlumno);
                }
               
                System.out.println("Ingrese el nombre del alumno que desea buscar: ");
                String buscado=leer.next();
                            
                for (Alumno unAlumno : listaAlumnos) {
                if (unAlumno.getNombre().equals(buscado)) {
                    System.out.println("Esta en la lista");
                    System.out.println("El promedio de "+buscado+" es: "+unAlumno.notaFinal());
                }
                }
            }
        } while (opcion != 2);

       
        

    }
}
