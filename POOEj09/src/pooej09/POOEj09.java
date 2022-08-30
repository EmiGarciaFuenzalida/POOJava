/*
 Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado
al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número
 */
package pooej09;

import Entidades.Matematica;

public class POOEj09 {

    public static void main(String[] args) {
        Matematica m = new Matematica();
        m.setNum1(Math.random()*10);
        m.setNum2(Math.random()*10);
        
        System.out.println("...");
        System.out.println("numero mayor = "+" "+m.devolverMayor());
        System.out.println("numero menor = "+" "+m.devolverMenor());
        System.out.println("la potencia del numero mayor por el menor es "+" "+m.calcularPotencia());
        System.out.println("la raiz cuadrada del numero menor es "+" "+m.calcularRaiz());
    } 
}
