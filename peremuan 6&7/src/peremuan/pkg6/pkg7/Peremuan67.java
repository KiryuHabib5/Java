/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peremuan.pkg6.pkg7;

/**
 *
 * @author WIN10
 */
public class Peremuan67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] angka = new int[5];
        int[] angka2 = {1,2,3,1000,5,6};
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };
        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.print("\n");
        }

//        for(int i : angka2){
//            System.out.println(i);
//        }
    }
    
}
