/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.User;
import com.exavalu.utils.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class LoginService {
    
    public static LoginService loginService = null;
    
    private LoginService(){}
    
    public static LoginService getInstance()
    {
        if(loginService==null)
        {
            return new LoginService();
        }
        else
        {
            return loginService;
        }
    }
    
    public boolean doLogin(User emp)
    {
        boolean success = false;
        
        String sql = "Select * from users where emailAddress=? and password=?";
        
        try {
            Connection con = JDBCConnectionManager.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, emp.getEmailAddress());
            ps.setString(2, emp.getPassword());
            
            System.out.println("LoginService :: "+ps);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                success = true;
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        return success;
    }
    
    
    
    
    
}
