/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.dao;

import java.sql.*;
import java.util.*;
import lidya240523.model.Anggota;
import lidya240523.model.Buku;
import lidya240523.model.Peminjaman;

/**
 *
 * @author ASUS F15
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    Connection connection;
    public PeminjamanDaoImpl (Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "Insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getAnggota().getNobp());
        ps.setString(2, peminjaman.getBuku().getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4, peminjaman.getTglKembali());
        ps.executeUpdate();
    }

    @Override
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql= "Update peminjaman set tglkembali=?" 
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,peminjaman.getTglKembali());
        ps.setString(2,peminjaman.getAnggota().getNobp());
        ps.setString(3,peminjaman.getBuku().getKodeBuku());
        ps.setString(4,peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public void delete(Peminjaman peminjaman) throws SQLException {
        String sql= "Delete from peminjaman " 
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1,peminjaman.getAnggota().getNobp());
        ps.setString(2,peminjaman.getBuku().getKodeBuku());
        ps.setString(3,peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public Peminjaman getPeminjaman(String nobp, String kodeBuku, String tglPinjam) throws SQLException {
        String sql = "select * from peminjaman "
                + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nobp);
        ps.setString(2, kodeBuku);
        ps.setString(3, tglPinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()) {
            peminjaman = new Peminjaman();
            AnggotaDao anggotaDao = new AnggotaDaoImpl(connection);
            Anggota anggota = anggotaDao.getAnggota(nobp);
            peminjaman.setAnggota(anggota);
            BukuDao bukuDao = new BukuDaoImpl(connection);
            Buku buku = bukuDao.getBuku(kodeBuku);
            peminjaman.setBuku(buku);
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }

    @Override
    public List<Peminjaman> getAll() throws SQLException {
        String sql = "Select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman;
        ResultSet rs = ps.executeQuery();
        List <Peminjaman> list = new ArrayList<>();
        while (rs.next()) {
            peminjaman = new Peminjaman();
            AnggotaDao anggotaDao = new AnggotaDaoImpl(connection);
            Anggota anggota = anggotaDao.getAnggota(rs.getString(1));
            peminjaman.setAnggota(anggota);
            BukuDao bukuDao = new BukuDaoImpl(connection);
            Buku buku = bukuDao.getBuku(rs.getString(2)); 
            peminjaman.setBuku(buku);
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}
