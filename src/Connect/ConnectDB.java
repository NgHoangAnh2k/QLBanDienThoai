    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public static Connection getConnect() throws SQLException {
        final String url="jdbc:mysql://localhost:3306/demo?useSSL=false";
        final String user="root";
        final String pass="Endgame3112";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection conn=DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (ClassNotFoundException ex) {
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}