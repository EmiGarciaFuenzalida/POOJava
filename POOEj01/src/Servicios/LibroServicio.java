/*
 Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;


public class LibroServicio {
    
    public Libro ingresarLibro(){
    
        //instanciar obj
        
        Libro lib1 = new Libro();
        
        //datos
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingresar numero de ISBN");
        lib1.setISBN(leer.nextInt());
        System.out.println("Ingresar el titulo del libro");
        lib1.setTitulo(leer.next());
        System.out.println("Ingresar titulo del libro");
        lib1.setAutor(leer.next());
        System.out.println("Numero de paginas");
        lib1.setNumPaginas(leer.nextInt());
        return lib1;
    }
    
}
