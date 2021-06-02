/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import dataBase.koneksiDatabase;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.modelBarang;
import java.util.Date;
/**
 *
 * @author Asus
 */
public class modelPemasokBarang {
    private modelBarang mB;
    private String namaPerusahaan;
    private String nomorIdentitas;
    private String namaBarang;
    private String Jenis;
    private int jumlah;
    private int harga;
    private String ukuran;
    private String satuan;
    private String alamatPerusahaan;
    private int stokBarang;
    private String idBarang;
    private Date date = new Date();
    koneksiDatabase koneksi = new koneksiDatabase();
    public modelPemasokBarang() {
        mB = new modelBarang();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStokBarang() {
        return stokBarang;
    }

    public void setStokBarang(int stokBarang) {
        this.stokBarang = stokBarang;
    }

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }
    
    

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    
    
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getNomorIdentitas() {
        return nomorIdentitas;
    }

    public void setNomorIdentitas(String nomorIdentitas) {
        this.nomorIdentitas = nomorIdentitas;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }

    public void setAlamatPerusahaan(String alamatPerusahaan) {
        this.alamatPerusahaan = alamatPerusahaan;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    

    public void tambah(){
        String sql = (
                "INSERT INTO pemasokbarang (namaPerusahaan, jumlah, tanggal, alamatPerusahaan) " +
                " VALUES ('"+getNamaPerusahaan()+"', '"+getJumlah()+"', '"+getDate()+"', '"+getAlamatPerusahaan()+"')");
        
        String sql2 = (
                "SELECT idBarang, stok FROM barang WHERE namaBarang = '" + getNamaBarang() + "'"
                );
        try {
            Statement stat = (Statement) koneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(sql2);
            
            while(res.next()){
                idBarang = res.getString("idBarang");
                stokBarang = res.getInt("stok");
                JOptionPane.showConfirmDialog(null, String.valueOf(stokBarang) + " dari " + getNamaBarang() + idBarang);
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            JOptionPane.showConfirmDialog(null, "GAGAL");
        }
        String sql3 = (
                "INSERT INTO barang (namaBarang, jenisBarang, satuan, ukuran, stok, harga) " +
                " VALUES ('"+getNamaBarang()+"', '"+getJenis()+"', '"+getSatuan()+"', '"+getUkuran()+"', '"+stokBarang+getJumlah()+"', '"+getHarga()+"')");
        int jumlah = stokBarang+getJumlah();
        String sql4 = (
                "UPDATE barang SET namaBarang =  '"+getNamaBarang()+"'"
                + ",jenisBarang = '"+getJenis()+"'"
                + ",satuan = '"+getSatuan()+"'"
                + ",ukuran = '"+getUkuran()+"'"
                + ",stok = '"+String.valueOf(jumlah)+"'"
                + ",harga = '"+getHarga()+"' WHERE idBarang = '"+ idBarang+"'"
                );       
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            PreparedStatement eksekusi2 = koneksi.getKoneksi().prepareStatement(sql4);
            eksekusi2.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil disimpan");
        } catch (Exception e) {            
            JOptionPane.showConfirmDialog(null, e);
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil disimpan");
        }
        
    }
    
//    public void ubahDataPemasokBarang(){
//        String sql = (
//                "UPDATE pemasokbarang SET namaPerusahaan =  '"+getNamaPerusahaan()+"'"
//                + ",namaBarang = '"+getNamaBarang()+"'"
//                + ",jenisBarang = '"+getJenis()+"'"
//                + ",harga = '"+getHarga()+"'"
//                + ",satuan = '"+getSatuan()+"'"
//                + ",ukuran = '"+getUkuran()+"'"
//                + ",jumlah = '"+getJumlah()+"'"
//                + ",alamatPerusahaan = '"+getAlamatPerusahaan()+"' WHERE nomorIdentitas = '"+getNomorIdentitas()+"'"
//                );
//        
//        try {
//            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
//            eksekusi.execute();
//            
//            JOptionPane.showMessageDialog(null, "Data Berasil diubah");
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Data Tidak Berasil diubah");
//        }
//        
//    }
    
        public void hapusDataPemasokBarang(){
        String sql = (
                "DELETE FROM pemasokbarang WHERE nomor = '"+getNomorIdentitas()+"'"
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
