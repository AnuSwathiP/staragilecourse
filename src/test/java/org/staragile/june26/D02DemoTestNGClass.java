package org.staragile.june26;

import org.testng.annotations.*;

public class D02DemoTestNGClass {
//    <!-- https://mvnrepository.com/artifact/org.testng/testng -->
//this dependency should paste and sync  in pom.xml
    @Test
    public void f() {
        System.out.println("Test");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }
}
