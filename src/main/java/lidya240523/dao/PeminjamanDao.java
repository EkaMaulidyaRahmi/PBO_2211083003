/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.dao;
import lidya240523.model.Peminjaman;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS F15
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(String nobp) throws SQLException;
    Peminjaman getPeminjaman(String nobp) throws SQLException;
    List<Peminjaman> getAll() throws SQLException;
}
