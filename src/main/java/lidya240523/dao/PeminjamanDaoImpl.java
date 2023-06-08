/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.dao;
import java.sql.*;
import lidya240523.model.Peminjaman;
import java.util.*;
import lidya270423.model.Buku;

/**
 *
 * @author ASUS F15
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    
    Connection connection;
    public PeminjamanDaoImpl (Connection connection) {
        this.connection = connection;
    }

    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "Insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
    }
    
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql= "Update peminjaman set kodebuku=?, tglpinjam=?, tglkembali=? where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,peminjaman.getNobp());
        ps.setString(2,peminjaman.getKodeBuku());
        ps.setString(3,peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();
    }
    
    public void delete(String nobp) throws SQLException {
        String sql = "Delete from peminjaman where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.executeUpdate();
    }
    
    public Peminjaman getPeminjaman(String nobp) throws SQLException {
        String sql = "Select * from peminjaman where nobp=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }
    
    public List<Peminjaman> getAll() throws SQLException {
        String sql = "Select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman = null;
        ResultSet rs = ps.executeQuery();
        List <Peminjaman> list = new ArrayList<>();
        while (rs.next()) {
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return list;
    }
}
