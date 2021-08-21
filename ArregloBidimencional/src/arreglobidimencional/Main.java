/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglobidimencional;

/**
 *
 * @author marcimex
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matrizA[][] = new int[3][3];
        
        matrizA[0][0]=1;
        matrizA[0][1]=2;
        matrizA[0][2]=3;
        
        matrizA[1][0]=4;
        matrizA[1][1]=5;
        matrizA[1][2]=6;
        
        matrizA[2][0]=7;
        matrizA[2][1]=8;
        matrizA[2][2]=9;
        
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                
                System.out.println("Matriz en la pocision i "+i+" ,j "+
                        j+" es: "+matrizA[i][j]);
                
                
            }
        }
    }
    
}
