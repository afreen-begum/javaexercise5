package com.stackroute;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StringCountNumberTest {

        StringCountNumber wordCount;
        @Before
        public void setUp() throws Exception {
            wordCount=new StringCountNumber();
        }

        @After
        public void tearDown() throws Exception {
            wordCount=null;
        }

        @Test
        public void checkFrequency() {
            String expected="{one=5, two=2, three=2}";
            String actual=wordCount.checkStringCount("one one -one___two,,three,one @three*one?two");
            assertEquals(expected,actual);
        }

        @Test
        public void checkFrequencyNull() {

            String actual=wordCount.checkStringCount(null);
            assertNull(actual);
        }
        @Test
        public void checkFrequencyNotNull() {

            String actual=wordCount.checkStringCount("i am Batman");
            assertNotNull(actual);
        }
}
