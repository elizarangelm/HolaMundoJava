
public class Primitivos {

    public static void main(String[] args) {
        
        // primitivos enteros: byte, short, int, long
        
        byte numByte = (byte)128; //queriendo usar un numero fuera de rango se convierte asi
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE); //-128
        System.out.println("valor maximo byte: " + Byte.MAX_VALUE);//127

        short numShort = (short)32768;
        System.out.println("numShort = " + numShort);
        System.out.println("valor minimo Short: " + Short.MIN_VALUE); //-32768
        System.out.println("valor maximo Short: " + Short.MAX_VALUE);//32767
        
        int numInt = (int)21474836478L; //L al final para decir que es de tipo long
        System.out.println("numInt = " + numInt);
        System.out.println("valor minimo Int: " + Integer.MIN_VALUE); //-2147483648
        System.out.println("valor maximo Int: " + Integer.MAX_VALUE);//21474836477
        
        long numLong = 9223372036854775807L; 
        System.out.println("numLong = " + numLong);
        System.out.println("valor minimo Long: " + Long.MIN_VALUE); //-9223372036854775808
        System.out.println("valor maximo Long: " + Long.MAX_VALUE);//9223372036854775807
    }
}
