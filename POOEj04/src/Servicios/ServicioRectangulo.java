/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("...");
        System.out.println("ingresar base");
        rectangulo.setBase(leer.nextInt());
        System.out.println("...");
        System.out.println("ingresar altura");
        rectangulo.setAltura(leer.nextInt());
        System.out.println("...");
        
        return rectangulo;
    }
    
    public int superficie (Rectangulo rectangulo){
        int superficie;
        superficie = rectangulo.getBase()*rectangulo.getAltura();
        return superficie;
    }
    public int perimetro (Rectangulo rectangulo){
        int perimetro;
        perimetro = (rectangulo.getBase()+rectangulo.getAltura())*2;
        return perimetro;
    }
    public void dibujar (Rectangulo rectangulo){
          int base = rectangulo.getBase(), altura = rectangulo.getAltura();

        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println("");
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("*");

            for (int j = 0; j < base - 2; j++) {
                System.out.print("  ");
            }
            System.out.print(" ");
            System.out.println("*");
        }
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }
        System.out.println("");
    }
}
