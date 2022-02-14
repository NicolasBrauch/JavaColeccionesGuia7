package ejercicio4colecciones;

import java.util.Comparator;

public class Pelicula {
    //atributos

    public String titulo;
    public String director;
    public int duracionDePeliculas;

    @Override
    public String toString() {
        return "Título = " + titulo + ", Director = " + director + ", Duracion de la pelicula = " + duracionDePeliculas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuracionDePeliculas() {
        return duracionDePeliculas;
    }

    //Método mayor a menor
    public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracionDePeliculas().compareTo(p1.getDuracionDePeliculas());
        }
    };
   
    //Método menor a mayor
    public static Comparator<Pelicula> compararDuracion2 = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDuracionDePeliculas().compareTo(p2.getDuracionDePeliculas());
        }
    };
    
    //Método ordenar por título alfabéticamente
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    //Método ordenar por director alfabéticamente
    public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
}
