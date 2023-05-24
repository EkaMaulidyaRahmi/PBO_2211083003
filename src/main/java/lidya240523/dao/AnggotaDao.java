/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lidya240523.dao;
import lidya240523.model.Anggota;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS F15
 */
public interface AnggotaDao  {
    void insert(Anggota anggota) throws SQLException;
    void update(Anggota anggota) throws SQLException;
    void delete(String nobp) throws SQLException;
    Anggota getAnggota(String nobp) throws SQLException;
    List<Anggota> getAll() throws SQLException;
}
