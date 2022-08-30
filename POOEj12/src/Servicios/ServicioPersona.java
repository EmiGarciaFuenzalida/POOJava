/*
  Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioPersona {
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        Persona persona = new Persona();
        int dia,mes,anio;
        
        System.out.println("crear persona");
        System.out.println("escribir nombre:");
        persona.setNombre(leer.nextLine());
        
        System.out.println("...");
        
        System.out.println("escribir fecha de nacimiento:");
        System.out.println("escribir dia:");
        dia = leer.nextInt();
        
        System.out.println("...");
        
        System.out.println("escribir mes:");
        mes = leer.nextInt();
        mes--;
        
        System.out.println("...");
        
        System.out.println("escribir año:");
        anio = leer.nextInt();
        anio -= 1900;
        
        Date fechaDeNacimiento = new Date (anio,mes,dia);
        System.out.println(fechaDeNacimiento);
        persona.setFechaDeNacimiento(fechaDeNacimiento);
        System.out.println("fin");
        System.out.println("...");
        return persona;
    }
    public void mostrarPersona(Persona persona){
        Date fechaDeNacimiento = persona.getFechaDeNacimiento();
        
        System.out.println("...");
        System.out.println("persona:");
        System.out.println("nombre:"+" "+persona.getNombre());
        System.out.println("fecha de nacimiento: "+" "+fechaDeNacimiento.getDate()+"/"+(fechaDeNacimiento.getMonth()+1)+"/"+(fechaDeNacimiento.getYear()+1900));
        System.out.println("edad:"+" "+persona.calcularEdad());
        System.out.println("...");
        System.out.println("fin");
    }
}
