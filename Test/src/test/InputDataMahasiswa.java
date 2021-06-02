/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;

/**
 *
 * @author WIN10
 */
public class InputDataMahasiswa {
    ArrayList<Mahasiswa> listMahasiswa;
    public InputDataMahasiswa(){
        this.listMahasiswa = new ArrayList<Mahasiswa>();
    }
    
    public void insertData(String nama, String nim, String alamat){
        Mahasiswa mhs = new Mahasiswa(nama, nim, alamat);
        this.listMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa> getAll(){
        return this.listMahasiswa;
    }
    
    public void delete(int idx){
        this.listMahasiswa.remove(idx);
    }
}
