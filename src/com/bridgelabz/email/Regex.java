package com.bridgelabz.email;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Regex {
	private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-z0-9]+@[a-z0-9]+.[a-z]{2,}$");
	private static Scanner sc;
    
	private boolean checkEmail(String email) {
        return EMAIL_PATTERN.matcher(email).matches();
    }
	
	public static void main(String args[]) {
		System.out.println("Welcome to Email Validation!");
		Regex r = new Regex();
		sc = new Scanner(System.in);
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		boolean emailValid = r.checkEmail(email);
		if(emailValid)
			System.out.println("Email is VALID!");
		else
			System.out.println("ERROR! Email is INVALID!");
	}

}
