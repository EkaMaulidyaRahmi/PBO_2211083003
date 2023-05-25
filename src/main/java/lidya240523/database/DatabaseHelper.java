/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lidya240523.database;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
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
            Connection con = getConnection();
            JOptionPane.showMessageDialog(null,"Koneksi OK");
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                
    }
}
