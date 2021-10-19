package com.bridgelabz.uservalidationjunit;
//Uc10
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.bridgelabz.uservalidation.Validation;
public class ValidationTest {
//Valid Test Case
	@Test
	public void givenFirstName_whenItIsValid_shouldPassTestCase(){
		assertTrue(Validation.validateName("Gayatri"));
	}
	@Test
	public void givenLastName_whenItIsValid_shouldPassTestCase(){
		assertTrue(Validation.validateName("Yawalkar"));
	}
	@Test
	public void givenemail_whenItIsValid_shouldPassTestCase(){
		assertTrue(Validation.validateEmail("abc.xyz@bl.co.in"));
	}
	@Test
	public void givenMobileNumber_whenItIsValid_shouldPassTestCase(){
		assertTrue(Validation.validateNumber("91 8888564534"));
	}
	@Test
	public void givenPassword_whenItIsValid_shouldPassTestCase(){
		assertTrue(Validation.validatePassword("Gayatri@1234"));
	}
//Invalid Test Case
	@Test
	public void givenFirstName_whenItIsInValid_shouldFailTestCase(){
		assertTrue(Validation.validateName("gayatri"));
	}
	@Test
	public void givenLastName_whenItIsInValid_shouldFailTestCase(){
		assertTrue(Validation.validateName("yawalkar"));
	}
	@Test
	public void givenemail_whenItIsInValid_shouldFailTestCase(){
		assertTrue(Validation.validateEmail("abc.xyzbl.co.in"));
	}
	@Test
	public void givenMobileNumber_whenItIsInValid_shouldFailTestCase(){
		assertTrue(Validation.validateNumber("91 888856534"));
	}
	@Test
	public void givenPassword_whenItIsInValid_shouldFailTestCase(){
		assertTrue(Validation.validatePassword("Gayatri1234"));
	}
}
