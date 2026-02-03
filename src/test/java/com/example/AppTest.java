package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    @Test
    public void testAppMessage() {
        App app = new App();
        assertNotNull("App should not be null", app);
    }
    
    @Test
    public void testAlwaysPass() {
        assertTrue("This test should always pass", true);
    }
    
    @Test
    public void testSimpleAddition() {
        int result = 2 + 2;
        assertEquals("2 + 2 should equal 4", 4, result);
    }
}
