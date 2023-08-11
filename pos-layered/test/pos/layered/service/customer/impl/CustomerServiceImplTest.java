/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pos.layered.service.customer.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pos.layered.dto.CustomerDto;

/**
 *
 * @author Himasha Lokusuriya
 */
public class CustomerServiceImplTest {
    
    public CustomerServiceImplTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addCustomer method, of class CustomerServiceImpl.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        CustomerDto customerDto = null;
        CustomerServiceImpl instance = new CustomerServiceImpl();
        String expResult = "";
        String result = instance.addCustomer(customerDto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
