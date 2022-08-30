/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Servicios;

import Entidades.Cafetera;

public class ServicioCafetera {
    public void llenarCafetera(Cafetera cafetera){
    
        System.out.println("");
        System.out.println("...");
        System.out.println("iniciando");
        cafetera.setCapacidadAcutal(cafetera.getCapacidadMaxima());
        System.out.println("terminado");
        System.out.println("...");
        System.out.println("");
    }
    public void vaciarCafetera(Cafetera cafetera){
        System.out.println("");
        System.out.println("...");
        System.out.println("vaciando cafetera");
        cafetera.setCapacidadAcutal(0);
        System.out.println("terminado");
        System.out.println("...");
        System.out.println("");
    }
    public void agregarCafe (Cafetera cafetera,int cantidadCafe){
        System.out.println("");
        System.out.println("...");
        if(cafetera.getCapacidadAcutal()+cantidadCafe>cafetera.getCapacidadMaxima()){
            System.out.println("exceso del limite, agregando faltante");
            cafetera.setCapacidadAcutal(cafetera.getCapacidadMaxima());
            System.out.println("terminado");
        }else{
            System.out.println("agregando");
            cafetera.setCapacidadAcutal(cafetera.getCapacidadAcutal()+cantidadCafe);
            System.out.println("terminado");
            System.out.println("...");
            System.out.println("");
        }  
    }
    public void servirTaza(Cafetera cafetera,int capacidadTaza){
        System.out.println("");
        System.out.println("...");
        if(cafetera.getCapacidadAcutal()>=capacidadTaza){
            System.out.println("sirviendo");
            cafetera.setCapacidadAcutal(cafetera.getCapacidadAcutal()-capacidadTaza);
            System.out.println("terminado");
        }else{
            System.out.println("cafe insuficiente,sirviendo restante");
            System.out.println("la cantidad fue " + " " +cafetera.getCapacidadAcutal());
            cafetera.setCapacidadAcutal(0);
            System.out.println("...");
            System.out.println("");
        }
    }
}
