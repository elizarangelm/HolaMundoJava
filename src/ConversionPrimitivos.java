
import java.util.Scanner;

public class ConversionPrimitivos {
    
    public static void main(String[] args) {
        // Convertir string a int
        //var edad = "20"; //201
        var edad = Integer.parseInt("20"); //21
        System.out.println("edad = " + (edad + 1));

        //string a double
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        //pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        //int a string
        var edadText = String.valueOf(10);
        System.out.println("edadText = " + edadText);

        //convertir a char
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);
        
        System.out.println("caracter:");
        caracter = consola.nextLine().charAt(3);
        System.out.println("caracter = " + caracter);
        
    }
}
