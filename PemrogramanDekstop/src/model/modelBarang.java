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
public class modelBarang {
    private String namaBarangModel;
    private String JenisBarangModel;
    private String satuanBarangModel;
    private String ukuranBarangModel;
    private String idBarangModel;
    private int stok;
    private int harga;
    koneksiDatabase koneksi = new koneksiDatabase();
    public modelBarang() {
        
    }
    
    

    public String getNamaBarangModel() {
        return namaBarangModel;
    }

    public void setNamaBarangModel(String namaBarangModel) {
        this.namaBarangModel = namaBarangModel;
    }

    public String getJenisBarangModel() {
        return JenisBarangModel;
    }

    public void setJenisBarangModel(String JenisBarangModel) {
        this.JenisBarangModel = JenisBarangModel;
    }

    public String getSatuanBarangModel() {
        return satuanBarangModel;
    }

    public void setSatuanBarangModel(String satuanBarangModel) {
        this.satuanBarangModel = satuanBarangModel;
    }

    public String getIdBarangModel() {
        return idBarangModel;
    }

    public void setIdBarangModel(String idBarangModel) {
        this.idBarangModel = idBarangModel;
    }

    public String getUkuranBarangModel() {
        return ukuranBarangModel;
    }

    public void setUkuranBarangModel(String ukuranBarangModel) {
        this.ukuranBarangModel = ukuranBarangModel;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
    
    
    
    
    

    public void simpanDataBarang(){
        String sql = (
                "INSERT INTO barang (namaBarang, jenisBarang, satuan, ukuran, stok, harga) " +
                " VALUES ('"+getNamaBarangModel()+"', '"+getJenisBarangModel()+"', '"+getSatuanBarangModel()+"', '"+getUkuranBarangModel()+"', '"+getStok()+"', '"+getHarga()+"')");
        JOptionPane.showMessageDialog(null, sql);
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil disimpan");
        }
        
    }
    
    public void ubahDataBarang(){
        String sql = (
                "UPDATE barang SET namaBarang =  '"+getNamaBarangModel()+"'"
                + ",jenisBarang = '"+getJenisBarangModel()+"'"
                + ",satuan = '"+getSatuanBarangModel()+"'"
                + ",ukuran = '"+getUkuranBarangModel()+"'"
                + ",stok = '"+getStok()+"' "
                + ",harga = '"+getHarga()+"' WHERE idBarang = '"+getIdBarangModel()+"'"
                );
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil diubah");
        }
        
    }
    
        public void hapusDataBarang(){
        String sql = (
                "DELETE FROM barang WHERE idBarang = '"+getIdBarangModel()+"'"
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
