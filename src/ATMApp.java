//Taimur Sohrab

import java.util.*;

public class ATMApp {

	private HashMap<Integer, Account> accounts = new HashMap<Integer, Account>();

	public void addAccount(Account acc){
		accounts.put(acc.getAccountNum(),acc);
	}

	public Account getAccount(int accountNum){
		return accounts.get(accountNum);
	}

	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);
		ATMApp ATM = new ATMApp();

		ATM.addAccount(new Account(323,"John Wayne",253,7463));
		ATM.addAccount(new Account(346,"Leeroy Jenkins",632,8255));
		ATM.addAccount(new Account(123,"John Wayne",153,1234));


		while(true){
			System.out.println("Welcome to the ATM! Please enter your account number: ");
			int choice = scan.nextInt();
			Account acc = ATM.getAccount(choice);

			double money = 0;

			if (acc == null){
				System.out.println("This account number is not in our system. Please try again.");
				continue;
			}
			System.out.println("Thank you. Please enter pin to verify identity.");

			choice = scan.nextInt();
			if (choice != acc.getPin()){
				System.out.println("This pin is incorrect. Please restart. Thank you.");
				continue;
			}

			System.out.println("Welcome " + acc.getUserName() + ". Please pick an option: ");
			System.out.println("1. Make Deposit \n2. Make Withdrawal \n3. Check Balance");
			choice = scan.nextInt();

			switch(choice){
				case 1 : 	System.out.println("How much will you Deposit?");
							money = scan.nextInt();
							acc.setBalance(acc.getBalance() + money);
							System.out.println("Thank you. You now have $" + acc.getBalance());
							break;
				case 2 : 	System.out.println("How much will you Withdraw?");
							money = scan.nextInt();
							acc.setBalance(acc.getBalance() + money);
							System.out.println("Thank you. You have $" + acc.getBalance() + " remaining.");
							break;
				default : 	System.out.println("You have $" + acc.getBalance() + " in your account");
							break;
			}
			System.out.println("Thank you. Please come again");
		}

	}

}


