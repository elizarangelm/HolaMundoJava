
public class Char {
    
    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);

        //lista unicode latam
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolos = '!';
        System.out.println("varCharSimbolos = " + varCharSimbolos);

        //haciendo lo mismo con var 
        var varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2);
        
        var varCharDecimal2 = 33; //se guarda tipo entero
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolos2 = '!';
        System.out.println("varCharSimbolos2 = " + varCharSimbolos2);

        //si ser imprime como entero devolvera su valor en decimal
        int varEnteraSimbolos = '!';
        System.out.println("varEnteraSimbolos = " + varEnteraSimbolos);
        
    }
}
