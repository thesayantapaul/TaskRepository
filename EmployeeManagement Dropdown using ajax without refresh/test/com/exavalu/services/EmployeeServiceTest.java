/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.services;

import com.exavalu.models.Employee;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SAYANTA PAUL
 */
public class EmployeeServiceTest {
    
    public EmployeeServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class EmployeeService.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        EmployeeService expResult = null;
        EmployeeService result = EmployeeService.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class EmployeeService.
     */
    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        EmployeeService instance = new EmployeeService();
        ArrayList expResult = null;
        ArrayList result = instance.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployee method, of class EmployeeService.
     */
    @Test
    public void testGetEmployee() {
        System.out.println("getEmployee");
        String employeeId = "";
        EmployeeService instance = new EmployeeService();
        Employee expResult = null;
        Employee result = instance.getEmployee(employeeId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEmployee method, of class EmployeeService.
     */
    @Test
    public void testUpdateEmployee() {
        System.out.println("updateEmployee");
        Employee emp = null;
        EmployeeService instance = new EmployeeService();
        boolean expResult = false;
        boolean result = instance.updateEmployee(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of InsertEmployee method, of class EmployeeService.
     */
    @Test
    public void testInsertEmployee() {
        System.out.println("InsertEmployee");
        Employee emp = null;
        EmployeeService instance = new EmployeeService();
        boolean expResult = false;
        boolean result = instance.InsertEmployee(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchEmployee method, of class EmployeeService.
     */
    @Test
    public void testSearchEmployee() {
        System.out.println("searchEmployee");
        Employee emp = null;
        EmployeeService instance = new EmployeeService();
        ArrayList expResult = null;
        ArrayList result = instance.searchEmployee(emp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
