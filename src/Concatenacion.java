/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elizabeth Rangel M
 */
public class Concatenacion {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;
        
        System.out.println(i+j);//suma de numeros
        System.out.println(i+j+usuario);//se evalua de izq a derecha
        System.out.println(usuario+i+j);
        System.out.println(usuario+(i+j));//como en matematicas, se evalua primero lo que este adentro de parentesis

    }
}
