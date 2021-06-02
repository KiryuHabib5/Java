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
public class Hero {
    
    protected double att;
    protected double deff;
    protected double health;
    protected String name = "player";
    protected static int nameDefault; 

    public Hero(double att, double deff, double health) {
        this.att = att;
        this.deff = deff;
        this.health = health;
        Hero.nameDefault++;
        System.out.println("Name : " + this.name + nameDefault);
        System.out.println("Darah : "+ this.health);
        System.out.println("att : "+ this.att);
        System.out.println("deff : "+ this.deff);
        System.out.println("==================");
    }
    
    public Hero(double attck, double deff, double health, String name) {
        this.att = attck;
        this.deff = deff;
        this.health = health;
        this.name = name;
        Hero.nameDefault++;
        System.out.println("Name : " + this.name);
        System.out.println("Darah : "+ this.health);
        System.out.println("att : "+ this.att);
        System.out.println("deff : "+ this.deff);
        System.out.println("==================");
    }
    
    public void info(){
        System.out.println("Name : " + this.name + nameDefault);
        System.out.println("Darah : "+ this.health);
        System.out.println("att : "+ this.att);
        System.out.println("deff : "+ this.deff);
        System.out.println("==================");
    }
    
    public void attack(Hero obj, double chance){
        double damage = chance * obj.deff;
        if (damage > this.att){
            damage = this.att;
        }else{
            obj.health -= (this.att - (damage));
        }
        System.out.println(obj.getHealth());
    }
    
    
    public double getAtt() {
        return att;
    }

    public void setAtt(double att) {
        this.att = att;
    }

    public double getDeff() {
        return deff;
    }

    public void setDeff(double deff) {
        this.deff = deff;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }
    
    
    
}
