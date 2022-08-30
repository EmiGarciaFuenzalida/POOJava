/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.*/
package pooej01;

import Entidades.Libro;
import Servicios.LibroServicio;


public class POOEj01 {

    
    public static void main(String[] args) {
        //instanciar
        LibroServicio ls = new LibroServicio();
        Libro lib1 = ls.ingresarLibro();
        System.out.println(lib1);
       
    }
    
}
