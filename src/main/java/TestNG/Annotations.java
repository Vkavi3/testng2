package TestNG;

import org.testng.annotations.*;


public class Annotations {

        @BeforeClass
        public static void runOnceBeforeClass() {
            System.out.println("@BeforeClass - runOnceBeforeClass");
        }

        // Run once, e.g close connection, cleanup
        @AfterClass
        public static void runOnceAfterClass() {
            System.out.println("@AfterClass - runOnceAfterClass");
        }

        // Should rename to @BeforeTestMethod
        // e.g. Creating an similar object and share for all @Test
        @BeforeMethod
        public void runBeforeTestMethod() {
            System.out.println("@Before - runBeforeTestMethod");
        }

        // Should rename to @AfterTestMethod
        @AfterMethod
        public void runAfterTestMethod() {
            System.out.println("@After - runAfterTestMethod");
        }

        @Test
        public void test_method_1() {
            System.out.println("@Test - test_method_1");
        }

        @Test
        public void test_method_2() {
            System.out.println("@Test - test_method_2");
        }


    }

