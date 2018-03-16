package com.euits.junit.test;


import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase
{
    @Test
    public void testPlus() {
    App calc = new App();
    int result = calc.sum(1,2);
    assertEquals(4, result);
    }
    
    @Test
    public void testMin() {
    App calc = new App();
    int result = calc.min(5,2);
    assertEquals(3, result);
    }
    
    @Test
    public void testMulti() {
    App calc = new App();
    int result = calc.multi(3,4);
    assertEquals(12, result);
    }
}
