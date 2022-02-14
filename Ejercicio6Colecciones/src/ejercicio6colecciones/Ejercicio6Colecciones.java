package ejercicio6colecciones;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio6Colecciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        HashMap< String,Double> mapaProductos = new HashMap();
        String producto = "";
        double precio = 0;
        double nuevoPrecio=0;
        int opcion = 0;

        do {
            //MENU
            System.out.println("1) Introducir un producto: ");
            System.out.println("2) Modificar precio de un producto: ");
            System.out.println("3) Eliminar un producto: ");
            System.out.println("4) Mostrar los productos que tenemos con su precio: ");
            System.out.println("5)Salir");
            System.out.println("");
            System.out.print("Que operación desea realizar: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introducir un elemento: ");
                    producto = leer.next();
                    System.out.println("Introducir el precio: ");
                    precio = leer.nextDouble();
                    mapaProductos.put(producto,precio);
                    break;

                case 2:
                    System.out.println("Introducir un elemento: ");
                    producto = leer.next();

                    if (mapaProductos.containsKey(producto)) {
                        System.out.println("Seleccione el nuevo precio ");
                        nuevoPrecio = leer.nextDouble();
                        mapaProductos.replace(producto,nuevoPrecio);
                    } else {
                        System.out.println("No se encuentra el elemento");
                    }

                    break;
                case 3:
                    System.out.println("Introducir un elemento para eliminar: ");
                    producto = leer.next();
                    if (mapaProductos.containsKey(producto)) {
                        System.out.println("Producto'" + producto + "' borrado");
                        mapaProductos.remove(producto);
                    } else {
                        System.out.println("No se encuentra el elemento");
                    }
                    break;
                case 4:
                    for (Map.Entry<String,Double> entry : mapaProductos.entrySet()) {
                        System.out.println("Producto : " + entry.getKey()
                                + ", Precio : " + entry.getValue());
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }

            if (opcion != 5) {
                System.out.println("1) Ir al menu");
                System.out.println("5) Salir");
                opcion = leer.nextInt();
            }

        } while (opcion != 5);

    }
}
