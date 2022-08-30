/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia .
e) Método perimetro(): para calcular el perímetro 
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    
    public Circunferencia crearCircunferencia(){
         Scanner leer = new Scanner(System.in);
         Circunferencia cir = new Circunferencia();
         System.out.println("INGRESAR RADIO");
         cir.setRadio(leer.nextDouble());
         return cir;
    }
    public double area (Circunferencia cir){
        double area;
        area = Math.PI * Math.pow(cir.getRadio(), 2);
        return area;
    }
    public double perimetro (Circunferencia cir){
        double perimetro;
        perimetro = 2*Math.PI*cir.getRadio();
        return perimetro;
    }
}

