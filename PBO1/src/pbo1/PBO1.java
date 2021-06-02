/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1;

/**
 *
 * @author WIN10
 */
public class PBO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia saya = new Manusia();
        
        saya.nama = "Ahmad Habib";
        saya.umur = 20;
        saya.jk = "laki-laki";
        
        saya.tampilInfo();
        saya.membaca();
        
        Manusia kamu = new Manusia();
        kamu.nama = "Asep";
        kamu.umur = 19;
        kamu.jk = "Laki-laki";
        
        kamu.tampilInfo();
        
        Sepeda spd = new Sepeda();
        spd.harga = 1000000000;
        spd.tipe = "lipat";
        spd.tampil();
    }
    
}
