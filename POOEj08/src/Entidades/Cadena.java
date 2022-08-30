/*
 Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String)
y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese una frase
que puede ser una palabra o varias palabras separadas por un espacio en blanco y a
través de los métodos set, se guardará la frase y la longitud de manera automática según
la longitud de la frase ingresada. Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Entidades;

public class Cadena {
    String frase;
    int longitudFrase;

    public String getFrase() {
        return frase;
    }

    public int getLongitudFrase() {
        return longitudFrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        longitudFrase = frase.length();
    }
    public void mostrarVocales(){
        for (int i = 0; i < longitudFrase; i++) {
            String letra = frase.substring(i,i+1);
            if(i<longitudFrase-1){
                switch(letra.toUpperCase()){
                    case "a" : System.out.println(letra+", ");
                    case "e" : System.out.println(letra+", ");
                    case "i" : System.out.println(letra+", ");
                    case "o" : System.out.println(letra+", ");
                    case "u" : System.out.println(letra+", ");
                }
            }else{
                switch(letra.toUpperCase()){
                    case "a" : System.out.println(letra+", ");
                    case "e" : System.out.println(letra+", ");
                    case "i" : System.out.println(letra+", ");
                    case "o" : System.out.println(letra+", ");
                    case "u" : System.out.println(letra+", ");
                }  
            }
        }
        System.out.println("...");
    }
    public void invertirFrase(){
        for (int i = longitudFrase; i > 0; i--) {
            System.out.println(frase.substring(i-1,i));
        }
        System.out.println("...");
    }
    public int vecesRepetido(String letra){
        int vecesRepetido = 0;
        for (int i = 0; i < longitudFrase; i++) {
            if(frase.substring(i,i+1).equals(letra)){
                vecesRepetido++;
            }
        }
        return vecesRepetido;
    }
    public boolean compararLongitud(String frase){
            return longitudFrase == frase.length();
    }
    public String unirFrases(String frase){
        String frasesUnidas = this.frase+" "+frase;
        return frasesUnidas;
    }
    public String reemplazarA (String letra){
      String frasesUnidas = "";
        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase("A")) {
                frasesUnidas+=letra;
            }else{
                frasesUnidas+=frase.substring(i,i+1);
            }
        }
        return frasesUnidas;
    }
    public boolean contiene(String letra){
        for (int i = 0; i < longitudFrase; i++) {
            if (frase.substring(i,i+1).equalsIgnoreCase(letra)) {
                return true;
            }
        }
        return false;
    }
}
