/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exavalu.models;

import com.exavalu.services.EmployeeService;
import com.exavalu.services.LoginService;
import com.exavalu.services.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import org.apache.struts2.dispatcher.ApplicationMap;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.SessionAware;

public class User extends ActionSupport implements ApplicationAware, SessionAware, Serializable {

    private String emailAddress, password, firstName, lastName, phone, countryCode, stateCode, distCode;

    private int status;

    private SessionMap<String, Object> sessionMap = (SessionMap) ActionContext.getContext().getSession();

    private ApplicationMap map = (ApplicationMap) ActionContext.getContext().getApplication();

    @Override
    public void setApplication(Map<String, Object> application) {
        setMap((ApplicationMap) application);
    }

    @Override
    public void setSession(Map<String, Object> session) {
        setSessionMap((SessionMap<String, Object>) (SessionMap) session);
    }

    public String doLogin() throws Exception {
        String result = "FAILURE";

        boolean success = LoginService.getInstance().doLogin(this);

        if (success) {
            System.out.println("returning Success from doLogin method");
            getSessionMap().put("Loggedin", this);
            ArrayList emplist = EmployeeService.getInstance().getAllEmployees();

            getSessionMap().put("EmpList", emplist);

            result = "SUCCESS";
        } else {
            System.out.println("returning Failure from doLogin method");
        }

        return result;
    }

    public String doSignUp() throws Exception {
        String result = "FAILURE";

        boolean success = UserService.getInstance().doSignUp(this);

        if (success) {
            System.out.println("returning Success from doSignUp method");
            result = "SUCCESS";
        } else {
            System.out.println("returning Failure from doSignUp method");
        }

        return result;
    }

    public String doPreSignUp() throws Exception {
        String result = "SUCCESS";

        ArrayList stateList;
        ArrayList distList;
        ArrayList countryList = UserService.getAllCountries();
        sessionMap.put("CountryList", countryList);
        if (this.getCountryCode() != null) {
            System.out.println("Country Code: " + this.getCountryCode());
            stateList = UserService.getAllStates(this.getCountryCode());
            sessionMap.put("StateList", stateList);
            sessionMap.put("User", this);
            result = "STATELIST";
        }
        
        
        
        if (this.getStateCode() != null) {
            System.out.println("State Code:" + this.getStateCode());
            distList = UserService.getAllDistricts(this.getStateCode());
            sessionMap.put("DistList", distList);
            System.out.println("Dist Code = " + this.distCode);
            sessionMap.put("User", this);
            result = "DISTLIST";
        }

        return result;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the addressLine1
     */
    /**
     * @return the addressLine2
     */
    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @param countryCode the countryCode to set
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the sessionMap
     */
    public SessionMap<String, Object> getSessionMap() {
        return sessionMap;
    }

    /**
     * @param sessionMap the sessionMap to set
     */
    public void setSessionMap(SessionMap<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    /**
     * @return the map
     */
    public ApplicationMap getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(ApplicationMap map) {
        this.map = map;
    }

    /**
     * @return the stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * @param stateCode the stateCode to set
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    /**
     * @return the distCode
     */
    public String getDistCode() {
        return distCode;
    }

    /**
     * @param distCode the distCode to set
     */
    public void setDistCode(String distCode) {
        this.distCode = distCode;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the address
     */
    /**
     * @return the employeeId
     */
}
