/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karakter;

/**
 *
 * @author WIN10
 */
public class Support extends Hero{
    
    public Support(double att, double deff, double health) {
        super(att, deff, health);
    }
    
    public void healing(Hero obj){
        if (obj.getHealth() < 100){
            obj.setHealth(100);
        }
    }
    

    
    public void attack(Hero obj, double chance, int buff){
        double damage = chance * obj.deff;
        if (damage > this.att){
            damage = this.att;
        }else{
            obj.health -= (buff*(this.att - (damage)));
        }
        System.out.println("Darah " + obj.name + ":" + obj.getHealth());
    }
    
}
