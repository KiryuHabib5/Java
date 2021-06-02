/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.modelTransaksi;
import view.viewTransaksi; 

/**
 *
 * @author Asus
 */
public class conrollerTransaksi {
    
    private modelTransaksi mT;
    private viewTransaksi  vT;
    
    public conrollerTransaksi(viewTransaksi vT){
        this.vT = vT;
    }
    
    //fungsi untuk memanggil model simpan transaksi
    public void simpanTransaksi(){
        mT = new modelTransaksi();
        mT.setIdTransaksi(vT.getId());
        mT.setNamaPelanggan(vT.getNamaPelanggan().getText());
        mT.setNamaBarang(vT.getNamaBarang().getText());
        mT.setQty(vT.getQty().getText());
        mT.setTotalBayar(vT.getTotalBayar().getText());
        mT.setUangBayar(vT.getUangBayar().getText());
        
        mT.simpanTransaksi();
    }
}
