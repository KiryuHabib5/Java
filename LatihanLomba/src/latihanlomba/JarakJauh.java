/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanlomba;

/**
 *
 * @author WIN10
 */
public class JarakJauh extends Hero{
    
    public JarakJauh(double att, double deff, double health) {
        super(att, deff, health);
    }
    
    public void healingTeman(Hero obj){
        obj.setHealth(obj.getHealth()+10.0);
    }
    public void attack(Hero enemy, double chance){
        super.attack(enemy, chance);
        double damage = chance * enemy.deff;
        if (damage >= this.att){
            damage = 1;
        }else{
            enemy.health -= (this.att - (damage));
        }
    }
    
}
