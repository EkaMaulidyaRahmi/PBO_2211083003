/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya270423.model;
import java.util.*;
/**
 *
 * @author ASUS F15
 */
public class BukuDaoImpl implements BukuDao {
    
    List<Buku> data = new ArrayList();
    
    public BukuDaoImpl(){
        data.add(new Buku("001", "Bumi", "Tere Liye", "Gramedia", "2021"));
        data.add(new Buku("002", "Bulan", "Tere Liye", "Gramedia", "2017"));
    }
    
    public void save(Buku buku) {
        data.add(buku);
    }
    
    public void update(int index, Buku buku) {
        data.set(index, buku);
    }
    
    public void delete (int index) {
        data.remove(index);
    }
    
    public Buku getBuku (int index) {
        return data.get(index);
    }
    
    public List<Buku> getAllBuku() {
        return data;
    }
}
