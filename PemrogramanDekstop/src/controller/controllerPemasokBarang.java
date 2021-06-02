/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.modelPemasokBarang;
import view.viewPemasokBarang;
/**
 *
 * @author Asus
 */
public class controllerPemasokBarang {
    private modelPemasokBarang mPB;
    private viewPemasokBarang vPB;
    
    public controllerPemasokBarang(viewPemasokBarang vPB){
        this.vPB = vPB;
    }
    
    public void bersihkan(){
        vPB.getNamaPerusahaanPemasokBarangView().setText("");
        vPB.getNamaBarangPemasokBarang().setText("");
        vPB.getJenisBarangPemasokBarang1().setText("");
        vPB.getHargaPersatuan().setText("");
        vPB.getSatuanPemasokBarangView().setText("");
        vPB.getUkuranPemasokBarangView().setText("");
        vPB.getJumlahPemasokBarangVieww().setText("");
        vPB.getAlamatPerusahaanView().setText("");
    }
    
    public void kontrolButton(){
        vPB.getTombolSimpanView().setEnabled(true);
        vPB.getTombolHapusView().setEnabled(false);
        //vPB.getTombolUbahView().setEnabled(false);
        vPB.getTombolBatalView().setEnabled(true);
    }
    public void kontrolButtonDua(){
        vPB.getTombolSimpanView().setEnabled(true);
        vPB.getTombolHapusView().setEnabled(true);
        //vPB.getTombolUbahView().setEnabled(true);
        vPB.getTombolBatalView().setEnabled(true);
    }
    
    public void hapus(){
        try {
            mPB = new modelPemasokBarang();
            mPB.setNomorIdentitas(vPB.getIdPemasokBarangView().getText());
            
            mPB.hapusDataPemasokBarang();
            bersihkan();
            kontrolButton();
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vPB, "Gagal Menghapus");
        }
    }
    
//    public void ubah(){
//        try {
//            mPB = new modelPemasokBarang();
//            mPB.setNomorIdentitas(vPB.getIdPemasokBarangView().getText());
//            mPB.setNamaPerusahaan(vPB.getNamaPerusahaanPemasokBarangView().getText());
//            mPB.setNamaBarang(vPB.getNamaBarangPemasokBarang().getText());            
//            mPB.setJenis(vPB.getJenisBarangPemasokBarang1().getText());
//            mPB.setHarga(Integer.parseInt(vPB.getHargaPersatuan().getText()));
//            mPB.setSatuan(vPB.getSatuanPemasokBarangView().getText());
//            mPB.setUkuran(vPB.getUkuranPemasokBarangView().getText());
//            mPB.setJumlah(Integer.parseInt(vPB.getJumlahPemasokBarangVieww().getText()));
//            mPB.setAlamatPerusahaan(vPB.getAlamatPerusahaanView().getText());
//            
//            mPB.ubahDataPemasokBarang();
//            bersihkan();
//            kontrolButton();
//        } catch (Exception e) {
//            JOptionPane.showConfirmDialog(vPB, "Masukan Inputan Dengan Benar!");
//        }
//    }
    
    public void simpan(){
        try {
            mPB = new modelPemasokBarang();
            mPB.setNomorIdentitas(vPB.getIdPemasokBarangView().getText());
            mPB.setNamaPerusahaan(vPB.getNamaPerusahaanPemasokBarangView().getText());
            mPB.setNamaBarang(vPB.getNamaBarangPemasokBarang().getText());
            mPB.setJenis(vPB.getJenisBarangPemasokBarang1().getText());
            mPB.setHarga(Integer.parseInt(vPB.getHargaPersatuan().getText()));
            mPB.setSatuan(vPB.getSatuanPemasokBarangView().getText());
            mPB.setUkuran(vPB.getUkuranPemasokBarangView().getText());
            mPB.setJumlah(Integer.parseInt(vPB.getJumlahPemasokBarangVieww().getText()));
            mPB.setAlamatPerusahaan(vPB.getAlamatPerusahaanView().getText());
            
            
            String namaPerusahaan = "Nama : "+mPB.getNamaPerusahaan();
            String namaBarang = "Nama Barang : "+mPB.getNamaBarang();
            String jenisBarang = "Jenis Barang : "+mPB.getJenis();
            String harga = "harga : " +mPB.getHarga();
            String satuan = "satuan : "+mPB.getSatuan();
            String ukuran = "ukuran : "+mPB.getUkuran();
            String jumlah = "jumlah : "+mPB.getJumlah();
            String alamat = "Alamat : "+mPB.getAlamatPerusahaan();
            JOptionPane.showConfirmDialog(vPB, namaPerusahaan+"\n"+namaBarang+"\n"+jenisBarang+"\n"+harga+"\n"+satuan+"\n"+ukuran+"\n"+jumlah+"\n"+alamat);
            mPB.tambah();
            bersihkan();
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vPB, "Masukan Inputan Dengan Benar!");
        }

        
    }
}
