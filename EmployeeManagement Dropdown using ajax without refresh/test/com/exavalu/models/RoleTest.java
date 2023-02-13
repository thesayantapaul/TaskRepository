/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.exavalu.models;

import java.util.Map;
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
public class RoleTest {
    
    public RoleTest() {
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
     * Test of setApplication method, of class Role.
     */
    @Test
    public void testSetApplication() {
        System.out.println("setApplication");
        Map<String, Object> application = null;
        Role instance = new Role();
        instance.setApplication(application);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSession method, of class Role.
     */
    @Test
    public void testSetSession() {
        System.out.println("setSession");
        Map<String, Object> session = null;
        Role instance = new Role();
        instance.setSession(session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleId method, of class Role.
     */
    @Test
    public void testGetRoleId() {
        System.out.println("getRoleId");
        Role instance = new Role();
        int expResult = 0;
        int result = instance.getRoleId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleId method, of class Role.
     */
    @Test
    public void testSetRoleId() {
        System.out.println("setRoleId");
        int roleId = 0;
        Role instance = new Role();
        instance.setRoleId(roleId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoleName method, of class Role.
     */
    @Test
    public void testGetRoleName() {
        System.out.println("getRoleName");
        Role instance = new Role();
        String expResult = "";
        String result = instance.getRoleName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoleName method, of class Role.
     */
    @Test
    public void testSetRoleName() {
        System.out.println("setRoleName");
        String roleName = "";
        Role instance = new Role();
        instance.setRoleName(roleName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
