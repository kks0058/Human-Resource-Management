/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intern;
import java.sql.*;
import javax.swing.*;
import javax.swing.JOptionPane;
/**
 *
 * @author dell
 */
public class db {
    Connection conn=null;
    public static Connection Java_db(){
    
    try{
    Class.forName("org.sqlite.JDBC");
    Connection conn=DriverManager.getConnection("jdbc:sqlite:E:\\HRM Project\\Intern\\usersDB.db");
    return conn;
            }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
    }
    
    }
    
}
