/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elizabeth Rangel M
 */
public class PrimitivosFloat {

    public static void main(String[] args) {
        // primitivos float: float y double
        float numFloat1 = (float) 10.0;
        float numFloat2 = 10.0F;

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("valor minimo Float: " + Float.MIN_VALUE); //1.4E-45
        System.out.println("valor maximo Float: " + Float.MAX_VALUE); //3.4028235E38

        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numFloat);
        System.out.println("valor minimo Double: " + Double.MIN_VALUE); //4.9E-324
        System.out.println("valor maximo Double: " + Double.MAX_VALUE); //1.7976931348623157E308

    }
}
