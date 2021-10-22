/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elizabeth Rangel M
 */
public class Booleanos {

    public static void main(String[] args) {
        boolean varBooleanf = false;
        System.out.println("varBooleanf = " + varBooleanf);
        boolean varBoolean = false;
        System.out.println("varBooleanv = " + varBoolean);

        if (varBoolean) {
            System.out.println("Verdadera");
        } else {
            System.out.println("falsa");
        }

        System.out.println("¿MAYOR O MENOR?");
        var edad = 15;

        //var esAdulto = edad >= 18;
        //System.out.println("¿es Adulto? = " + esAdulto);
        if (edad >= 18) {
            System.out.println("Mayor");
        } else {
            System.out.println("Menor");
        }
    }
}
