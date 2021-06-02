/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author WIN10
 */
public class KoneksiDatabase {
    private static Connection conn;
    
    public static Connection getKoneksi(){
        
        if (conn == null){
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root","");
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        return conn;
    }
    
    public static void main(String[] args) {
        if(getKoneksi().equals(conn)){
            System.out.println("Berhasil yey");
        }
    }
}
