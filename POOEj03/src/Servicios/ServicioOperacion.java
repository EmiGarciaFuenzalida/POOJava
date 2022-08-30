/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;


public class ServicioOperacion {
    
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion operacion = new Operacion();
        
        System.out.println("...");
        System.out.println("ingresar numero1");
        operacion.setNumero1(leer.nextDouble());
        System.out.println("...");
        System.out.println("ingresar numero2");
        operacion.setNumero2(leer.nextDouble());
        System.out.println("...");
        return operacion;
    }
    public double sumar(Operacion operacion){
        double suma;
        suma = operacion.getNumero1()+operacion.getNumero2();
        return suma;
    }
    public double restar (Operacion operacion){
        double resta;
        resta = operacion.getNumero1()-operacion.getNumero2();
        return resta;
    }
    public double multiplicar (Operacion operacion){
        double multiplicacion;
        multiplicacion = operacion.getNumero1()*operacion.getNumero2();
        return multiplicacion;
    }
    public double dividir (Operacion operacion){
        double division;
        if(operacion.getNumero2()==0){
            System.out.println("error");
            return 0;
        }else{
        division = operacion.getNumero1()/operacion.getNumero2();
        return division;
        }
    }
}
