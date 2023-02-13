/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.Country;
import com.exavalu.models.District;
import com.exavalu.models.Province;
import com.exavalu.models.User;
import com.exavalu.utils.JDBCConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserService {

    public static UserService userService = null;

    public static ArrayList getAllCountries() {

        ArrayList countryList = new ArrayList();
        Connection con = JDBCConnectionManager.getConnection();

        try {
            String sql = "Select * from countries";

            PreparedStatement preparedStatement = con.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Country country = new Country();
                country.setCountryCode(rs.getString("countryCode"));
                country.setCountryName(rs.getString("countryName"));
                countryList.add(country);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        try {
//            con.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            
//        }
        System.err.println("Size of country List :  " + countryList.size());
//        System.out.println("Country Code = " + countryCode());
        return countryList;
    }

    public static ArrayList getAllStates(String countryCode) {

        ArrayList stateList = new ArrayList();
        Connection con = JDBCConnectionManager.getConnection();

        try {
            String sql = "Select * from states where countryCode = ?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, countryCode);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Province province = new Province();
                province.setProvinceCode(rs.getString("stateCode"));
                province.setProvinceName(rs.getString("stateName"));

                province.setCountryCode(rs.getString("countryCode"));

                stateList.add(province);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        try {
//            con.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            
//        }
        System.err.println("Size of State List :  " + stateList.size());
        return stateList;

    }

    public static ArrayList getAllDistricts(String stateCode) {
                ArrayList distList = new ArrayList();
        Connection con = JDBCConnectionManager.getConnection();

        try {
            String sql = "Select * from districts where stateCode = ?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, stateCode);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                District dist = new District();
                dist.setProvinceCode(rs.getString("stateCode"));
                dist.setDistCode(rs.getString("districtCode"));
                dist.setDistName(rs.getString("districtName"));


                distList.add(dist);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
//        try {
//            con.close();
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            
//        }
        System.err.println("Size of District List :  " + distList.size());
        return distList;
    }

    private UserService() {
    }

    public static UserService getInstance() {
        if (userService == null) {
            return new UserService();
        } else {
            return userService;
        }
    }

    public boolean doSignUp(User emp) {
        boolean success = false;

        Connection con = JDBCConnectionManager.getConnection();
        String sql = "INSERT INTO users (emailAddress,password,firstName,lastName,status,countryCode,stateCode,distCode) VALUES (? ,? ,? ,? ,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, emp.getEmailAddress());
            preparedStatement.setString(2, emp.getPassword());
            preparedStatement.setString(3, emp.getFirstName());
            preparedStatement.setString(4, emp.getLastName());
            preparedStatement.setInt(5, 1);
            preparedStatement.setString(6, emp.getCountryCode());
            preparedStatement.setString(7, emp.getStateCode());
            preparedStatement.setString(8, emp.getDistCode());

            preparedStatement.executeUpdate();
            System.out.println("LoginService :: " + preparedStatement);

            success = true;

            //con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return success;
    }
    
}
