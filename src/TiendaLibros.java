
import java.util.Scanner;

/*
Se solicita capturar la siguiente información de una tienda de libros:

nombre (String)

id (int)

precio (double)

envioGratuito (boolean)

Tu tarea es imprimir un mensaje en el siguiente formato:

Proporciona el nombre:
Proporciona el id:
Proporciona el precio:
Proporciona el envio gratuito:
<nombre> #<id>
Precio: <simbolo><precio>
Envio Gratuito: <envioGratuito>
Por ejemplo:

Proporciona el nombre:
Programacion con Java
Proporciona el id:
1520
Proporciona el precio:
899
Proporciona el envio gratuito:
true
Programacion con Java #1520
Precio: $899.00
Envio Gratuito: true
Puedes utilizar el IDE de tu preferencia para codificar la solución y después pegar tu solución en esta herramienta.
*/
public class TiendaLibros {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre+" #"+id+"\nPrecio: $"+precio+"\nEnvio Gratuito: "+ envioGratuito);
    }
}
