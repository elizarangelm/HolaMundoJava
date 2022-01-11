
public class ArrayTeam {
    public static void main(String[] args) {
        int [] arrayT = new int[]{12,1,12,3,12,1,1,2,3,3};
        int contador = 0;
        
        
        for (int i = 0; i <arrayT.length ; i++) {
            for (int j = 0; j< arrayT.length ; j++) {
                if (arrayT[i]==arrayT[j]) {
                    contador++; 
                }
                else{
                    System.out.println("Este valor solo se repite una vez"+ arrayT[i]);
                }
            }
        }
    }
}
