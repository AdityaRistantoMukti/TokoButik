/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 *
 * @author Adit
 */
public class usersession {
    private static int id;
    private static String username;    
    private static String nama;
    private static String password;
    private static int img;
    private static int totalPembelian;
    
    public static int get_id(){
        return id;
    }
    
    public static void set_id(int id){
        usersession.id = id;
    }
    public static int get_tp(){
        return totalPembelian;
    }
    
    public static void set_tp(int tp){
        usersession.totalPembelian = totalPembelian;
    }
    
    public static String get_username(){
        return username;
    }
    
    public static void set_username(String username){
        usersession.username = username;
    }
    
    public static String get_nama(){
        return nama;
    }
    
    public static void set_nama(String nama){
        usersession.nama = nama;
    }
    
    public static String getU_password() {
        return password;
    }

    public static void setU_password(String password) {
        usersession.password = password;
    }
    
    public static int get_img(){
        return img;
    }
    
    public static void set_img(int img){
        usersession.img = img;
    }
}
