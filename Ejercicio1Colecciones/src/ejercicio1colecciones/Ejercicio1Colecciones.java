package ejercicio1colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1Colecciones {

    /*EJERCICIO 1
    Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String.
    El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
    después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si
    decide salir, se mostrará todos los perros guardados en el ArrayList.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int opcion = 0;
        ArrayList<String> razas = new ArrayList<>();

        String perro = "";
        int bandera = 0;
        int contador = 0;
        do {
            System.out.println("Ingrese una raza de perro: ");
            perro = leer.next();
            razas.add(perro);
            System.out.println("1) Cargar otra raza ");
            System.out.println("2) Salir");
            opcion = leer.nextInt();
        } while (opcion != 2);

        System.out.println("Las razas de perro guardadas son: ");
        for (String unperro : razas) {
            System.out.println(unperro);
        }

        /*EJERCICIO 2:
        al usuario se le pedirá un perro y se recorrerá la lista con un Iterator,
        se buscará el perro en la lista.
        Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
        la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
        se mostrará la lista ordenada.*/
        System.out.println("-------------------------------------");
        System.out.println("Ingrese una raza para eliminar: ");
        perro = leer.next();
        Iterator iterator = razas.iterator();
        while (iterator.hasNext()) {
            contador++;
            if (iterator.next().equals(perro)) {
                System.out.println("Raza eliminada: " + razas.get(contador - 1));
                iterator.remove();
                bandera = 1;
            }
        }

        if (bandera == 0) {
            System.out.println("El perro no se encuentra en la lista");
        }

        Collections.sort(razas);
        System.out.println("Lista ordenada de razas de perros: ");
        for (String unperro : razas) {
            System.out.println(unperro);
        }
    }

}
