package org.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class MainTest {
    private Main main;

    @Before
    public void setUp() {
        main = new Main("Hello");
    }

    @Test
    public void testGetGreeting() {
        assertEquals("Hello", main.getGreeting());
    }

    @Test
    public void testFormatGreeting() {
        assertEquals("Hello, world!", main.formatGreeting("world"));
        assertEquals("Hello, Alice!", main.formatGreeting("Alice"));
    }
}