package ejercicio5colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio5Colecciones {

    /*Se requiere un programa que lea y guarde países, y para evitar que se ingresen
    repetidos usaremos un conjunto. El programa pedirá un país en un bucle, se
    guardará el país en el conjunto y después se le preguntará al usuario si quiere
    guardar otro país o si quiere salir, si decide salir, se mostrará todos los países
    guardados en el conjunto.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashSet<String> conjuntoPaises = new HashSet();
        int opcion = 0;

        //Leer y guardar países en un conjunto
        do {
            System.out.println("Ingrese un país: ");
            String pais = leer.next();
            conjuntoPaises.add(pais);
            System.out.println("Desea guardar otro país? 1)Si 2) No");
            opcion = leer.nextInt();
        } while (opcion != 2);

        //Mostrar conjunto
        System.out.println("El conjunto es: ");
        for (String unPais : conjuntoPaises) {
            System.out.println(unPais);
        }
        System.out.println("");
        
        //Ordenar conjunto      
        ArrayList<String> listaPaises = new ArrayList(conjuntoPaises);
        Collections.sort(listaPaises);

        //Mostrar Conjunto ordenado
        System.out.println("El conjunto ordenado es: ");
        for (String unPais : listaPaises) {
            System.out.println(unPais);
        }
        System.out.println("");

        /*al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator,
        se buscará el país en el conjunto y si está en el conjunto se eliminará el país que
        ingresó el usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto
        se le informará al usuario*/
        
        int tamanioConjunto = conjuntoPaises.size();
        System.out.println("Ingrese un país: ");
        String paisAborrar = leer.next();
        Iterator iterator = conjuntoPaises.iterator();
        while (iterator.hasNext()) {
            if (paisAborrar.equals(iterator.next())) {
                iterator.remove();
            }
        }

        System.out.println("");
        if (tamanioConjunto == conjuntoPaises.size()) {
            System.out.println("No se encontró el país");
        } else {
            System.out.println("El conjunto con un país eliminado es: ");
            for (String unPais : conjuntoPaises) {
                System.out.println(unPais);
            }
        }

    }

}
