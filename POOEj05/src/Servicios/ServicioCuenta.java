/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

public class ServicioCuenta {
    public Cuenta abrirCuenta(){
        Scanner leer = new Scanner (System.in);
        Cuenta cuenta = new Cuenta();
        
        System.out.println("");
        System.out.println("...");
        System.out.println("ingresar nro de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("...");
        System.out.println("ingresar DNI");
        cuenta.setDNI(leer.nextInt());
        System.out.println("...");
        System.out.println("ingresar saldo inicial");
        cuenta.setSaldo(leer.nextDouble());
        System.out.println("...");
        System.out.println("");
        return cuenta;
    }
    
    public void depositarDinero(Cuenta cuenta){
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("...");
        System.out.println("ingresar monto del deposito");
        double deposito = leer.nextDouble();
        System.out.println("...");
        if (deposito<0){
            System.out.println("reintentar");
        }else{
            cuenta.setSaldo(cuenta.getSaldo() + deposito);
            System.out.println("Deposito finalizado");
            System.out.println("");
        }
    }
    public void retirarDinero(Cuenta cuenta){
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("...");
        System.out.println("ingrese monto del retiro");
        double retiro = leer.nextDouble();
        System.out.println("...");
        if(retiro>cuenta.getSaldo()){
            System.out.println("Saldo insuficiente,reintentar");
        }else if (retiro<0){
            System.out.println("monto negativo, reintentar");
        }else{
            cuenta.setSaldo(cuenta.getSaldo() - retiro);
            System.out.println("Retiro exitoso");
            System.out.println("...");
            System.out.println("");
        }
    }
    public void extraccionRapida(Cuenta cuenta){
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("...");
        System.out.println("cuanto desea retirar?");
        double retiro = leer.nextDouble();
        System.out.println("...");
        if((retiro*100)/cuenta.getSaldo()>20){
            System.out.println("Monto invalido, reintentar");   
        }else if (retiro<0){
            System.out.println("El monto no puede ser negativo, reintentar");
        }else{
             cuenta.setSaldo(cuenta.getSaldo() - retiro);
             System.out.println("extraccion rapida exitosa");
             System.out.println("...");
             System.out.println("");
        }
    }
    public void consultarSaldo(Cuenta cuenta){
        System.out.println("");
        System.out.println("...");
        System.out.println("el saldo actual es "+" "+ cuenta.getSaldo());
        System.out.println("...");
        System.out.println("");
    }
    public void consultarDatos(Cuenta cuenta){
        System.out.println("");
        System.out.println("...");
        System.out.println("el numero de la cuenta es: "+" "+cuenta.getNumeroCuenta());
        System.out.println("el numero de DNI es: "+" "+cuenta.getDNI());
        System.out.println("el saldo es de: "+" "+cuenta.getSaldo());
        System.out.println("...");
        System.out.println("");
    }
}
