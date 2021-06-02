/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import dataBase.koneksiDatabase;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */



public class modelTransaksi {
    private String namaPelanggan;
    private String idPelanggan;
    private String totalbayar;
    private String uangBayar;
    //tabek transaksi
    private String idTransaksiDetail;
    private String idTransaksi;
    private String namaBarang;
    private String qty;
    private String subTotal;
    private String tanggal;
    
    //gettter setter
    
    private String getTanggal(){
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MMd-dd");
        Date date = new Date();        
        this.tanggal = dateFormat1.format(date);
        return this.tanggal;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getTotalBayar() {
        return totalbayar;
    }

    public void setTotalBayar(String totalBayar) {
        this.totalbayar = totalBayar;
    }

    public String getUangBayar() {
        return uangBayar;
    }

    public void setUangBayar(String uangBayar) {
        this.uangBayar = uangBayar;
    }

    public String getIdTransaksiDetail() {
        return idTransaksiDetail;
    }

    public void setIdTransaksiDetail(String idTransaksiDetail) {
        this.idTransaksiDetail = idTransaksiDetail;
    }

    public String getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(String subTotal) {
        this.subTotal = subTotal;
    }
    
    
    public void simpanTransaksi(){
        String sql = "INSERT INTO transaksi (idTransaksi, namaPelanggan, tanggalTransaksi, totalBayar, uangBayar)"
                + "VALUES ('"+getIdTransaksi()+"','"+getNamaPelanggan()+"','"+getTanggal()+"','"+getTotalBayar()+"',"
                +" '"+getUangBayar()+"')";
        
        try{
            PreparedStatement eksekusi = koneksiDatabase.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
                    
            JOptionPane.showMessageDialog(null, "Data Transaksi berhasil disimpan");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Transaksi gagal disimpan");
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
