/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya060423;

/**
 *
 * @author ASUS F15
 */
public class LatihanEntriBukuAlamat {
    private String nama;
    private String alamat;
    private String telp;
    private String email;
    private static int EntryBukuCount;
    
    public LatihanEntriBukuAlamat(){
        EntryBukuCount++;
    }
     public LatihanEntriBukuAlamat(String temp){ 
        this.nama = temp; 
        this.alamat = temp;
        this.telp = temp;
        this.email = temp;
        EntryBukuCount++;
    } 
    
    public LatihanEntriBukuAlamat(String nama, String alamat, String telp, String email) {
        this.nama = nama;
        this.alamat = alamat;
        this.telp = telp;
        this.email = email;
        
        EntryBukuCount++;
    } 
    
    public String getNama() {
        return nama;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat (String alamat) {
        this.alamat = alamat;
    }
    
    public String getTelp() {
        return telp;
    }
    public void setTelp (String telp) {
        this.telp = telp;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail (String email) {
        this.email = email;
    }
    
    public static int  getEntryBukuCount(){
        return EntryBukuCount;
        
    }
    
    public void print (String temp) {
        System.out.println("Nama          : "+nama);
        System.out.println("Alamat        : "+alamat);
        System.out.println("No. Telp      : "+telp);
        System.out.println("Alamat E-Mail : "+email);
    }
}
