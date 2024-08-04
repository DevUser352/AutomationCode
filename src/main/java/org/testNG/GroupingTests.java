package org.testNG;

import org.testng.annotations.Test;

public class GroupingTests {

    @Test(groups = {"group1"})
    public void testMethod1(){
        System.out.println("This is test method 1 in group 1.");
    }
    @Test(groups = {"group1"})
    public void testMethodGroup(){
        System.out.println("i am belongs from group1 method");
    }

    @Test(groups = {"group2"})
    public void testMethod2(){
        System.out.println("This is test method 2 in group 2.");
    }
    @Test(groups = {"group2"})
    public void testMethod2Group2(){
        System.out.println(" i am belongs from group2 method");
    }
}
