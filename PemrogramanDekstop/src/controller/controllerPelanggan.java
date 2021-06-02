/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.modelPelanggan;
import view.viewPelanggan;
import view.viewPelangganInternal;
/**
 *
 * @author Asus
 */
public class controllerPelanggan {
    private modelPelanggan mP;
    private viewPelangganInternal vP;
    
    public controllerPelanggan(viewPelangganInternal vP){
        this.vP = vP;
    }
    
    public void bersihkan(){
        vP.getNamaPelangganView().setText("");
        vP.getIdPelangganView().setText("");
        vP.getNoHpPelangganView().setText("");
        vP.getAlamatPelangganView().setText("");
        vP.getUmurpelangganView().setText("");
    }
    
    public void kontrolButton(){
        vP.getTombolSimpanView().setEnabled(true);
        vP.getTombolHapusView().setEnabled(false);
        vP.getTombolUbahView().setEnabled(false);
        vP.getTombolBatalView().setEnabled(true);
    }
    public void kontrolButtonDua(){
        vP.getTombolSimpanView().setEnabled(false);
        vP.getTombolHapusView().setEnabled(true);
        vP.getTombolUbahView().setEnabled(true);
        vP.getTombolBatalView().setEnabled(true);
    }
    
    public void hapus(){
        try {
            mP = new modelPelanggan();
            mP.setIdPelanggan(vP.getIdPelangganView().getText());
            
            mP.hapusDataPelanggan();
            bersihkan();
            kontrolButton();
            //JOptionPane.showConfirmDialog(vP, name+"\n"+noHp+"\n"+jk+"\n"+umur+"\n"+alamat);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vP, "Gagal Menghapus");
        }
    }
    
    public void ubah(){
        try {
            mP = new modelPelanggan();
            mP.setIdPelanggan(vP.getIdPelangganView().getText());
            mP.setNamaPelangganModel(vP.getNamaPelangganView().getText());
            mP.setNoHpModel(vP.getNoHpPelangganView().getText());
            if (vP.getPriaView().isSelected()){
                mP.setJenisKelamin("Pria");
            }else if (vP.getWanitaView().isSelected()){
                mP.setJenisKelamin("Wanita");
            }
            mP.setUmur(Integer.parseInt(vP.getUmurpelangganView().getText()));
            mP.setAlamat(vP.getAlamatPelangganView().getText());
            String name = "Nama : "+mP.getNamaPelangganModel();
            String noHp = "No. Hp : "+mP.getNoHpModel();
            String jk = "Jenis Kelamin : " +mP.getJenisKelamin();
            String umur = "Umur : "+mP.getUmur();
            String alamat = "Alamat : "+mP.getAlamat();
            
            mP.ubahDataPelanggan();
            bersihkan();
            kontrolButton();
            //JOptionPane.showConfirmDialog(vP, name+"\n"+noHp+"\n"+jk+"\n"+umur+"\n"+alamat);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vP, "Masukan Inputan Dengan Benar!");
        }
    }
    
    public void simpan(){
        try {
            mP = new modelPelanggan();
            mP.setNamaPelangganModel(vP.getNamaPelangganView().getText());
            mP.setNoHpModel(vP.getNoHpPelangganView().getText());
            if (vP.getPriaView().isSelected()){
                mP.setJenisKelamin("Pria");
            }else if (vP.getWanitaView().isSelected()){
                mP.setJenisKelamin("Wanita");
            }
            mP.setUmur(Integer.parseInt(vP.getUmurpelangganView().getText()));
            mP.setAlamat(vP.getAlamatPelangganView().getText());
            String name = "Nama : "+mP.getNamaPelangganModel();
            String noHp = "No. Hp : "+mP.getNoHpModel();
            String jk = "Jenis Kelamin : " +mP.getJenisKelamin();
            String umur = "Umur : "+mP.getUmur();
            String alamat = "Alamat : "+mP.getAlamat();
            
            mP.simpanDataPelanggan();
            bersihkan();
            //JOptionPane.showConfirmDialog(vP, name+"\n"+noHp+"\n"+jk+"\n"+umur+"\n"+alamat);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(vP, "Masukan Inputan Dengan Benar!");
        }

        
    }
}
