package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class UpdateArrayElementTest {
    UpdateArrayElement arrayList;
    @Before
    public void setUp() throws Exception {
        arrayList=new UpdateArrayElement();
    }

    @After
    public void tearDown() throws Exception {
        arrayList=null;
    }

    @Test
    public void addArray() {
        String expected="[Kiwi, Grape, Mango, Berry]";
        String actual=arrayList.addArray("Kiwi Grape Mango Berry".split(" ")).toString();
        assertEquals(expected,actual);
    }
    @Test
    public void removeAll() {
        String expected="[]";
        arrayList.addArray("Kiwi Grape Mango Berry".split(" "));
        String actual=arrayList.removeAll().toString();
        assertEquals(expected,actual);
    }
    @Test
    public void update() {
        String expected="[Kiwi, Grape, Mango, Berry]";
        arrayList.addArray("Apple Grape Melon Berry".split(" "));
        arrayList.update(0,"Kiwi");

        String actual=arrayList.update(2,"Mango").toString();
        assertEquals(expected,actual);
    }
}
