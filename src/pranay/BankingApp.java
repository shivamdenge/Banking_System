package pranay;

import java.util.Scanner;

public class BankingApp {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	User user = new User(sc);
	AccountManager accountmanager = new AccountManager(sc);
	Accounts accounts = new Accounts(sc);
	user.register();
	
	}

}
