/* * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author digitalcare
 */
public class dbconn {
   public Connection con;
    public Statement st;
    public ResultSet rs;
    public void loaddriver()
    {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null, ex.getMessage());
        }
       
        }
    public void conn()
    {
        try {
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","office","office");
            st=con.createStatement();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }
    public void fetch(String s)
    {
        try {
            rs=st.executeQuery(s);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
                
    }  
}
