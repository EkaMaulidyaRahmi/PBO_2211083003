/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lidya270423.model;
import java.util.*;

/**
 *
 * @author ASUS F15
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int index, Peminjaman peminjaman);
    void delete (int index);
    Peminjaman getPeminjaman (int index);
    List<Peminjaman> getAllPeminjaman();
}