/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lidya040523.model;
import java.util.*;

/**
 *
 * @author ASUS F15
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int idx, Peminjaman peminjaman);
    void delete (int idx);
    Peminjaman getPeminjaman (int idx);
    List<Peminjaman> getAllPeminjaman();
}
