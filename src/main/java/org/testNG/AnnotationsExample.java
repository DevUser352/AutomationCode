package org.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsExample {

    @BeforeClass
    public void setup(){
        System.out.println("Setup before class.");
    }
    @Test
    public void testMethod(){
        System.out.println("This is a TestNG test method");
    }
    @AfterClass
    public void teardown(){
        System.out.println("Teardown after class.");
    }


}
