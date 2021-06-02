/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuantiga;
import Karakter.*;
/**
 *
 * @author WIN10
 */
public class PertemuanTiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hero asep = new Hero(20, 30, 100);
        Hero adit = new Hero(20, 50, 100, "adit");
        Support jojo = new Support(10, 30, 200);
//        
        

        asep.attack(adit, 0.2);
        
    }
    
}
