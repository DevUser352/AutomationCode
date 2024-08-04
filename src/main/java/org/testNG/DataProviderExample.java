package org.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @DataProvider(name = "data-provider")
    public Object[][] dpMethod(){
        return new Object[][]{{"data one"},{"data two"}};
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String data){
        System.out.println("Data is: "+data);
    }

}
