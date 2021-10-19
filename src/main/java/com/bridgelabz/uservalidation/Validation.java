package com.bridgelabz.uservalidation;
import java.util.regex.Pattern;
//Uc10
public class Validation {
	public static final String NAME_REGEX="[A-Z][a-z]{2,}";
	public static final String NUMBER_REGEX="91\s{1}[7-9]{1}[0-9]{9}";
	public static final String EMAIL_REGEX="[A-Za-z]+(\\.[A-Za-z]+)?@[a-zA-Z]+\\.co(m)?(\\.in)?";
	public static final String PASSWORD="(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()]).{8,}";
	public static boolean validateName(String name) {
		return Pattern.matches(NAME_REGEX, name);
	}
	public static boolean validateNumber(String number) {
		return Pattern.matches(NUMBER_REGEX, number);
	}
	public static boolean validateEmail(String email) {
		return Pattern.matches(EMAIL_REGEX, email);
	}
	public static boolean validatePassword(String pass) {
		return Pattern.matches(PASSWORD, pass);
	}
}
