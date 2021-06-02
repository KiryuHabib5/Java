/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.modelBarang;
import model.modelPelanggan;
//import view.viewPelanggan;
//import view.viewPelangganInternal;
import view.viewBarang;
/**
 *
 * @author Asus
 */
public class controllerBarang {
    private modelBarang mB;
    private viewBarang vB;
    
    public controllerBarang(view.viewBarang vB){
        this.vB = vB;
    }
    
    public void bersihkan(){
        vB.getNamaBarangView().setText("");
        vB.getIdBarangView().setText("");
        vB.getJenisBarangView().setText("");
        vB.getSatuanBarangView().setText("");
        vB.getUkuranBarangView().setText("");
        vB.getStokBarangView().setText("");
        vB.getHargaBarangView().setText("");
    }
    
    public void kontrolButton(){
        vB.getTombolSimpanView().setEnabled(true);
        vB.getTombolHapusView().setEnabled(false);
        vB.getTombolUbahView().setEnabled(false);
        vB.getTombolBatalView().setEnabled(true);
    }
    public void kontrolButtonDua(){
        vB.getTombolSimpanView().setEnabled(false);
        vB.getTombolHapusView().setEnabled(true);
        vB.getTombolUbahView().setEnabled(true);
        vB.getTombolBatalView().setEnabled(true);
    }
    
    public void hapus(){
        try {
            mB = new modelBarang();
            mB.setIdBarangModel(vB.getIdBarangView().getText());
            
            mB.hapusDataBarang();
            bersihkan();
            kontrolButton();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vB, "Gagal Menghapus");
        }
    }
    
    public void ubah(){
        try {
            mB = new modelBarang();
            mB.setIdBarangModel(vB.getIdBarangView().getText());
            mB.setNamaBarangModel(vB.getNamaBarangView().getText());
            mB.setJenisBarangModel(vB.getJenisBarangView().getText());
            mB.setSatuanBarangModel(vB.getSatuanBarangView().getText());
            mB.setUkuranBarangModel(vB.getUkuranBarangView().getText());
            mB.setStok(Integer.parseInt(vB.getStokBarangView().getText()));
            mB.setHarga(Integer.parseInt(vB.getHargaBarangView().getText()));
            
            mB.ubahDataBarang();
            bersihkan();
            kontrolButton();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vB, "Masukan Inputan Dengan Benar!");
        }
    }
    
    public void simpan(){
        try {
            mB = new modelBarang();
            mB.setNamaBarangModel(vB.getNamaBarangView().getText());
            mB.setJenisBarangModel(vB.getJenisBarangView().getText());
            mB.setSatuanBarangModel(vB.getSatuanBarangView().getText());
            mB.setUkuranBarangModel(vB.getUkuranBarangView().getText());
            mB.setStok(Integer.parseInt(vB.getStokBarangView().getText()));
            mB.setHarga(Integer.parseInt(vB.getHargaBarangView().getText()));
            
            String name = "Nama : "+mB.getNamaBarangModel();
            String jenis = "Jenis : "+mB.getJenisBarangModel();
            String satuan = "Satuan : " +mB.getSatuanBarangModel();
            String ukuran = "Ukuran : "+mB.getUkuranBarangModel();
            String stok = "Stok : "+mB.getStok();
            String harga = "harga : "+mB.getHarga();
            
            mB.simpanDataBarang();
            bersihkan();
            JOptionPane.showConfirmDialog(vB, name+"\n"+jenis+"\n"+satuan+"\n"+ukuran+"\n"+stok+"\n"+harga);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vB, "Masukan Inputan Dengan Benar!");
        }

        
    }
}
