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
}
