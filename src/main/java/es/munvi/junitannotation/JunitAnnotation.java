/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.munvi.junitannotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author joselopezruiz
 */
public class JunitAnnotation {
    //execute before class
   @BeforeClass
   public static void beforeClass() {
      System.out.println("in before class");
   }

   //execute after class
   @AfterClass
   public static void  afterClass() {
      System.out.println("in after class");
   }

   //execute before test
   @Before
   public void before() {
      System.out.println("in before");
   }
	
   //execute after test
   @After
   public void after() {
      System.out.println("in after");
   }
	
   //test case
   @Test
   public void test() {
      System.out.println("in test");
   }
   
   //test second case
   @Test
   public void secondtest() {
      System.out.println("in second test");
   }
	
   //test case ignore and will not execute
   @Ignore
   public void ignoreTest() {
      System.out.println("in ignore test");
   }
}
