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
public class Mobil {
    int kec;
    int bensin;
    static String nama;
    
    public Mobil(int speed, int bensin){
        this.kec = speed;
        this.bensin = bensin;
        System.out.println("Kecepatan awal : " + this.kec);
    }
    
    public int tambahKecepatan(int speed){
        this.bensin -= 1;
        return this.kec+=speed;
    }
    
}
