package pranay;

import java.util.Scanner;

public class User {
	private Scanner sc;
	public User(Scanner sc) {
	   this.sc=sc;	
	}

	public void register() {
		System.out.println("Full Name :");
		String fullname=sc.nextLine();
		System.out.println("Email :");
		String email=sc.nextLine();
		System.out.println("Password :");
		String password=sc.nextLine();
	}
	
	public void login() {
		
	}
}
