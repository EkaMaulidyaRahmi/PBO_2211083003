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
public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> data = new ArrayList<>();
    public PeminjamanDaoImpl() {
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"27-04-2023","02-05-2023"));
        data.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(1),"15/04/2023","01/05/2023"));
    }
    
    public void save(Peminjaman peminjaman) {
        data.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman) {
        data.add(index,peminjaman);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    public Peminjaman getPeminjaman(int index){
        return data.get(index);
    }
    public List<Peminjaman> getAllPeminjaman(){
        return data;
    } 
}
