/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.services;

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
public class DepartmentServiceTest {
    
//    public DepartmentServiceTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getInstance method, of class DepartmentService.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        DepartmentService expResult = null;
        DepartmentService result = DepartmentService.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllDepartment method, of class DepartmentService.
     */
    @Test
    public void testGetAllDepartment() {
        System.out.println("getAllDepartment");
        DepartmentService instance = null;
        ArrayList expResult = null;
        ArrayList result = instance.getAllDepartment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
