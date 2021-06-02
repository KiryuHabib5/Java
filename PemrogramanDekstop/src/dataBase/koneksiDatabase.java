/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataBase;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.sql.Statement;
import javax.imageio.stream.FileImageInputStream;
/**
 *
 * @author Asus
 */
public class koneksiDatabase {   
    private static Connection conn;
    private static Properties propert = new Properties();
    private static Statement stm;
    
    public static Connection getKoneksi(){
        //mengecek adakah koneksi
        if(conn == null){
            //load file konfigurasiDatabase.properties
            
            try {
                propert.load(new FileInputStream("D:\\Habib\\Java\\PemrogramanDekstop\\src\\dataBase\\konfigurasiDatabase.properties"));
                conn = DriverManager.getConnection(propert.getProperty("jdbc.url"),propert.getProperty("jdbc.username"), propert.getProperty("jdbc.password"));
                //Class.forName("com.mysql.jdbc.Driver");
                //conn = DriverManager.getConnection("jdbc:mysql://localhost/jajal", "root", "");
                //stm = conn.createStatement();
            } catch (Exception e) {
                System.out.println("ADA ERROR GAN!!");
                System.out.println(e);
            }
            
            
        }
        return conn;
    }
    
    public static void main(String[] args) {
        if(getKoneksi().equals(conn)){
            System.out.println("Sukses Terkoneksi");
        }
    }
    
}
