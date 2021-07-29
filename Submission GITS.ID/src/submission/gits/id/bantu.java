/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package submission.gits.id;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class bantu {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Masukan input : ");
        String sentence = input.next();
        String reverseSentence = "";
        for (int i = (sentence.length()-1); i >= 0; i--){
            reverseSentence += sentence.charAt(i);
        }
        System.out.println(reverseSentence);
    }
}
