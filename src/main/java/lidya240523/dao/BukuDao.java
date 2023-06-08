/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.dao;
import lidya240523.model.Buku;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author ASUS F15
 */
public interface BukuDao {
    void insert(Buku buku) throws SQLException;
    void update(Buku buku) throws SQLException;
    void delete(String kodebuku) throws SQLException;
    Buku getBuku(String kodebuku) throws SQLException;
    List<Buku> getAll() throws SQLException;
}
