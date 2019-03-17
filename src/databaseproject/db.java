
package databaseproject;
import java.sql.*;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.JOptionPane;
public class db {
    Connection conn=null;
    public static Connection javadb()
    {
       try
        {
            Class.forName("org.sqlite.JDBC");
           
            Connection conn  = DriverManager.getConnection("jdbc:sqlite:Mydata.sqlite");
            return conn;
        }
        catch(Exception e)
        {
          JOptionPane.showMessageDialog(null,e);
          return null;
        }
    } 
}
