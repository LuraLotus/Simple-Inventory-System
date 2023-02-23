package com.simpleinvtysys;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestClassOrder;
import org.junit.jupiter.params.provider.ValueSource;

import com.simpleinvtysys.DBMngr;

public class InvtyTest {
    
    DBMngr obj = new DBMngr();
    
    @Test
    @DisplayName("Addition Test")
    void testSum()
    {
        assertEquals(3, obj.sumTest(1, 2));
    }

    @Test
    @DisplayName("idk")
    public void testMethod()
    {

    }
}
