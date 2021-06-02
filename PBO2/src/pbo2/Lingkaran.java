/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2;

/**
 *
 * @author WIN10
 */
public class Lingkaran implements LuasLingkaran{
    double jariJari;
    static double i = 0;
    
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;   
        i++;
    }
    
    public double getLuas(){
        return pi*this.jariJari*this.jariJari;
    }
    
    public void info(){
        System.out.println(getLuas());
        System.out.println(i);
    }
}
