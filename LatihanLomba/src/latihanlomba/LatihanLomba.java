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
public class LatihanLomba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        System.out.print("Masukan nilai N : ");
//        Scanner inputUser = new Scanner(System.in);
//        int N = inputUser.nextInt();
//        while ( N < 2 | N > 1000){
//            System.out.println("N harus lebih besar atau sama dengan 2 dan kurang dari atau sama dengan 1000 ");
//            System.out.print("Masukan nilai N : ");
//            N = inputUser.nextInt();
//        }
//        UrutanAneh.urutanAneh(N);

        Hero asep = new Hero(20, 50, 100);
        Hero adit = new Hero(20, 50, 100);
        
        
        JarakJauh panah =  new JarakJauh(30, 40, 100);
        panah.attack(asep, 0.5);
       
        System.out.println("Darah asep : "+ asep.getHealth());
        
        panah.healingTeman(asep);
        System.out.println("Darah asep : "+ asep.getHealth());
        
    }
    
}
