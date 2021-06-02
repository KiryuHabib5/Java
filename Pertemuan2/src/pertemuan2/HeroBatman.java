/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author WIN10
 */
public class HeroBatman implements Hero{
    String name;
    int att;
    int def;

    public HeroBatman(String name, int att, int def) {
        this.name = name;
        this.att = att;
        this.def = def;
        
        System.out.println("name : " + this.name);
        System.out.println("att : " + this.att);
        System.out.println("def : " + this.def);
    }    
    
    

    public void menyerang(int x){
        System.out.println(this.name+ " menyerang sebesar " + x);
    }
    
}
