package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


    public class MapStringBooleanTest {
        MapStringBoolean appearance;
        @Before
        public void setUp() throws Exception {
            appearance=new MapStringBoolean();
        }

        @After
        public void tearDown() throws Exception {
            appearance=null;
        }

        @Test
        public void checkAppearance() {
            String expected="{a : true, b : false, c : true, d : false}";
            String arr[] = {"a","b","c","d","a","c","c"};
            String actual=appearance.checkAppearance(String.join(" ",arr)).replaceAll("="," : ");
            assertEquals(expected,actual);
        }

        @Test
        public void checkAppearanceNull() {

            String actual=appearance.checkAppearance(null);
            assertNull(actual);

        }

    }