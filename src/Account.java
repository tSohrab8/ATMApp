
public class Account {
	private int accountNum;
	private String userName;
	private double balance;
	private int pin;
	
	public Account(){
		this(0,"User",0,0);
	}
	
	public Account(int accountNum, String userName, double balance, int pin){
		this.accountNum = accountNum;
		this.userName = userName;
		this.balance = balance;
		this.pin = pin;
	}
	
	public int getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	
}
