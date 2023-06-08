/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.database;

import lidya240523.dao.*;
import lidya240523.model.*;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS F15
 */
public class DatabaseHelper {
    private static Connection connection;
    
    public static Connection getConnection() throws SQLException{
        if(connection == null){
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/pbo_ekamaulidyarahmi");
            dataSource.setUser("root");
            dataSource.setPassword("");
            
            connection = dataSource.getConnection();
        }
        return connection;
    }
    
    public static void main(String[] args) {
        try{
            connection = DatabaseHelper.getConnection();
            Anggota anggota = new Anggota();
            anggota.setNobp("98312111");
            anggota.setNama("Ali");
            anggota.setAlamat("Padang");
            anggota.setJenisKelamin("L");
            AnggotaDao dao = new AnggotaDaoImpl(connection);
            dao.insert(anggota);
            
            JOptionPane.showMessageDialog(null,"Entri Ok");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            connection = DatabaseHelper.getConnection();
            Buku buku = new Buku();
            buku.setKodeBuku("1232");
            buku.setJudulBuku("Bulan");
            buku.setPengarang("Tere Lie");
            buku.setPenerbit("Gramedia");
            BukuDao dao = new BukuDaoImpl(connection);
            dao.insert(buku);
            
            JOptionPane.showMessageDialog(null,"Entri Ok");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            connection = DatabaseHelper.getConnection();
            Peminjaman peminjaman = new Peminjaman();
            peminjaman.setNobp("98312111");
            peminjaman.setKodeBuku("1232");
            peminjaman.setTglPinjam("06-06-2023");
            peminjaman.setTglKembali("09-06-2023");
            PeminjamanDao dao = new PeminjamanDaoImpl(connection);
            dao.insert(peminjaman);
            
            JOptionPane.showMessageDialog(null,"Entri Ok");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
