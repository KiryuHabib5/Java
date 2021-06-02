/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlomba;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class UrutanAneh {
    
    public static void urutanAneh(int N){
        Scanner inputUser = new Scanner(System.in);
        int[] angka = new int[N];
        int angkaBantu;
        for (int i = 0; i < N; i++){
            System.out.print("Masukan angka : ");
            angkaBantu = inputUser.nextInt();
            while (angkaBantu < 0 | angkaBantu > 100){
                System.out.println("Angka harus 0 - 100");
                System.out.print("Masukan angka : ");
                angkaBantu = inputUser.nextInt();
            }
            angka[i] = angkaBantu;
        }
        tampiArray(angka);
        
        int sisaA;
        int sisaB;
        int temp;
        for (int i = 0; i < angka.length; i++){
            for (int j = 1; j < angka.length-i; j++){
                sisaA = (angka[j-1]%10);
                sisaB = (angka[j]%10);
                if ( sisaA > sisaB ){
                    temp = angka[j-1];
                    angka[j-1] = angka[j];
                    angka[j] = temp;
                }
                if (sisaA == sisaB){
                    if (angka[j-1] > angka[j]){
                        temp = angka[j-1];
                        angka[j-1] = angka[j];
                        angka[j] = temp;
                    }
                }
            }
        }
        tampiArray(angka);
                
    }
    public static void tampiArray(int[] data){
        System.out.print("[");
        for (int i = 0; i < data.length; i++){            
            System.out.print(data[i]);
            if (i != data.length-1){
                System.out.print(",");
            }
        }        
        System.out.println("]");
    }
    
    
    public static void tampiArray(String[] data){
        System.out.print("[");
        for (int i = 0; i < data.length; i++){            
            System.out.print(data[i]);
            if (i != data.length-1){
                System.out.print(",");
            }
        }        
        System.out.println("]");
    }
}
