package arreglobidimencional;
/**
 * @author Adrian
 */
public class Main1 {
    public static void main(String[] args){
        //filas y columnas de matriz 1
        int a1 =2;//filas
        int b1 =2;//columnas
        
        //filas y columnas de matriz 2
        int a2 =2;//filas
        int b2 =2;//columnas
        
        //se crea y se asigna  filas y columnas a la matriz.
        int [][] matriz1=new int[a1][b1];
        
        matriz1[0][0]=10;
        matriz1[0][1]=20;
        matriz1[1][0]=30;
        matriz1[1][1]=40;
        
        //se crea y se asigna  filas y columnas a la matriz.
        int [][] matriz2=new int[a2][b2];
        
        matriz2[0][0]=2;
        matriz2[0][1]=5;
        matriz2[1][0]=2;
        matriz2[1][1]=5;
        
  
        int [][] matrizR = new int [a1][b2];
        
         
        if (b1==a2){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {   
                for (int k = 0; k < matriz1.length; k++) {
                    
                     matrizR[i][j] += matriz1[i][k] * matriz2[k][j];
                }
                  System.out.println("Resultado "+i+","+j+" es:"+matrizR[i][j]);  
               
            }
             
        }
             
        }else{
            System.out.println("No se peuede efectuar la multiplicacion de las Matrices.");
        }

        
        
    }
    
}
