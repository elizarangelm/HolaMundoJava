
public class TiposDeDatos {
      public static void main(String args[]){
          //Definir variable
          int miVariableEntera = 10;
          System.out.println(miVariableEntera);
          //Modificamos el valor de la variable
          miVariableEntera = 5;
          System.out.println(miVariableEntera);
          
          String miVariableCadena = "Saludos";
          System.out.println(miVariableCadena);
          
          miVariableCadena = "Adios";
          System.out.println(miVariableCadena);
          
          //var - inferencia de tipos de 
          var miVariableEntera2 = 15;
          System.out.println(miVariableEntera2);
          
          var miVariableCadena2 = "Nueva Cadena";
          System.out.println("miVariableCadena2 = " + miVariableCadena2);
          
          //Valores permitdos en los nombres de las variable
          var miVariable = 1;
          var _miVariable = 2;
          var $miVariable = 3;
          
      
          // àmiVariable = 1; no se recomienda usar acentos
          // #miVariable = 1; no se puede usar caracteres especiales
      }   
}
