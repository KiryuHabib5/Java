/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import dataBase.koneksiDatabase;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class modelPelanggan {
    private String namaPelangganModel;
    private String noHpModel;
    private String jenisKelamin;
    private int umur;
    private String alamat;
    private String idPelanggan;
    koneksiDatabase koneksi = new koneksiDatabase();
    public modelPelanggan() {
        
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    
    
    public void setNamaPelangganModel(String namaPelangganModel) {
        this.namaPelangganModel = namaPelangganModel;
    }

    public void setNoHpModel(String noHpModel) {
        this.noHpModel = noHpModel;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNamaPelangganModel() {
        return namaPelangganModel;
    }

    public String getNoHpModel() {
        return noHpModel;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public String getAlamat() {
        return alamat;
    }
    
    public void simpanDataPelanggan(){
        String sql = (
                "INSERT INTO pelanggan (namaPelanggan, noHp, jenisKelamin, umur, alamat) " +
                " VALUES ('"+getNamaPelangganModel()+"', '"+getNoHpModel()+"', '"+getJenisKelamin()+"', '"+getUmur()+"', '"+getAlamat()+"')");
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil disimpan");
        }
        
    }
    
    public void ubahDataPelanggan(){
        String sql = (
                "UPDATE pelanggan SET namaPelanggan =  '"+getNamaPelangganModel()+"'"
                + ",noHp = '"+getNoHpModel()+"'"
                + ",jenisKelamin = '"+getJenisKelamin()+"'"
                + ",umur = '"+getUmur()+"'"
                + ",alamat = '"+getAlamat()+"' WHERE idPelanggan = '"+getIdPelanggan()+"'"
                );
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil diubah");
        }
        
    }
    
        public void hapusDataPelanggan(){
        String sql = (
                "DELETE FROM pelanggan WHERE idPelanggan = '"+getIdPelanggan()+"'"
                );
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil hapus");
        }
        
    }
    
    
    
}
