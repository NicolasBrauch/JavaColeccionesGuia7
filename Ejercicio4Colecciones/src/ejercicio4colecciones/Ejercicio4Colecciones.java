package ejercicio4colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4Colecciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion = 0;
        ArrayList<Pelicula> listaPeliculas = new ArrayList();
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el título de la película: ");
            pelicula.titulo = leer.next();
            System.out.println("Ingrese el director de la película: ");
            pelicula.director = leer.next();
            System.out.println("Ingrese la duración: ");
            pelicula.duracionDePeliculas = leer.nextInt();
            listaPeliculas.add(pelicula);
            System.out.println("1)Cargar otra películas");
            System.out.println("2)Salir");
            opcion = leer.nextInt();
        } while (opcion != 2);

        System.out.println("Cantidad de peliculas: " + listaPeliculas.size());
        for (Pelicula unaPelicula : listaPeliculas) {
            System.out.println(unaPelicula);
        }

        System.out.println("");
        System.out.println("Cantidad de peliculas con duración mayor a una hora: ");
       
        for (Pelicula unaPelicula : listaPeliculas) {
            if (unaPelicula.duracionDePeliculas > 1) {
                System.out.println(unaPelicula);
            }
        }

        System.out.println("");
        System.out.println("Peliculas ordenadas de mayor duración a menor duración: ");

        listaPeliculas.sort(Pelicula.compararDuracion);
        for (Pelicula unaPelicula : listaPeliculas) {
            System.out.println(unaPelicula);
        }

        System.out.println("");
        System.out.println("Peliculas ordenadas de menor duración a mayor duración: ");

        listaPeliculas.sort(Pelicula.compararDuracion2);
        for (Pelicula unaPelicula : listaPeliculas) {
            System.out.println(unaPelicula);
        }

        System.out.println("");
        System.out.println("Peliculas ordenadas por título alfabeticamente: ");

        listaPeliculas.sort(Pelicula.compararTitulo);
        for (Pelicula unaPelicula : listaPeliculas) {
            System.out.println(unaPelicula);
        }

        System.out.println("");
        System.out.println("Peliculas ordenadas por director alfabeticamente: ");

        listaPeliculas.sort(Pelicula.compararDirector);
        for (Pelicula unaPelicula : listaPeliculas) {
            System.out.println(unaPelicula);
        }
    }

}
