/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xeratic.programming.challenge;

/**
 *
 * @author WIN10
 */
public class XeraticProgrammingChallenge {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("=======================================\n");
        System.out.println("1. Deret Cross Fibonacci");
        System.out.println(CrossFibonacci.deretCrossfibonacci(14));
        System.out.println("=======================================\n");
        System.out.println("2. Operasi Left Shift");
        System.out.println(LeftShift.calculate(3, 4));
        System.out.println(LeftShift.calculate(4, 6));
        System.out.println("=======================================\n");
        System.out.println("3. EncryptMessage");
        System.out.println(EncryptMessage.cipher("HELLO WORLD", "thesa"));
        System.out.println(EncryptMessage.cipher("ini adalah pesan", "rahasia"));
        System.out.println("=======================================\n");
        System.out.println("4. Sorting");
        int[] arr = {12,11,13,5,6};
        int[] arr2 = {12,11,13,5,6,0,66,9,4,2,7};
        tampilArray(InsertionSort.sort(arr));
        tampilArray(InsertionSort.sort(arr2));
        System.out.println("=======================================\n");
        System.out.println("5. Troubleshoot");
        System.out.println(Troubleshoot.calculate(50));
        System.out.println(Troubleshoot.calculate(100));
        System.out.println("=======================================");
    }
    
    public static void tampilArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]);
            if (i != array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
}
