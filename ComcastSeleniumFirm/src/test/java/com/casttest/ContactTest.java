package com.casttest;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="smoke")
	public void crearecontact() {
		System.out.println("execute create");
	}
       @Test(groups="regionl")
       public void createwithcontact() {
    	   System.out.println("execute create with");
    	   
       }
       @Test(groups="regionl")
       public void deletecontact() {
    	   System.out.println("deletecontact");
       }
       @Test(groups="regionl")
       public void searchcontact() {
    	   System.out.println("deletecontact");
    	   
       }
}
