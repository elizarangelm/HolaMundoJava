
import java.util.Scanner;

public class Escaner {

    public static void main(String args[]){
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        var usuario = consola.nextLine(); //metodo next line detiene la consola
        System.out.println("Usuario = " + usuario);
        System.out.println("Escribe tu titulo");
        var titulo = consola.nextLine();
        System.out.println("resultado "+ titulo+ " "+ usuario);
    }
}
