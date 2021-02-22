/**
 * 
 * @author akhalil
 * all methods
 */
public class OptionsClass {
	static double accounts[] = new double[Configuration.numberAccounts];
	/**
	 * check your balance
	 * @param accountNumber (ask you about your bank number)
	 */
	public static String getBalance(int accountNumber) {

		if( accountNumber >= 0 && accountNumber < Configuration.numberAccounts) {
			return "your balance is: " + String.valueOf(accounts[accountNumber]) + "$";
		}
		else {
			return "This account is not in use! \nPlease try again!";
		}
		
	}
	/**Transfer money from bank to another 
	 * @param sender (ask you about your bank number)
	 * @param money (ask you about how much money want you to transfer)
	 * @param receiver(ask you about which account would you to transfer this money )
	 */
	public static String getTransfer(int sender, int money, int receiver) {

	 
		if(sender >= 0 && sender < Configuration.numberAccounts && money >= 0 && receiver >= 0 && receiver < Configuration.numberAccounts) {
			accounts[receiver] += money;	
			return "Your new account balance is:" + String.valueOf(accounts[sender] -= money);
				
					/*System.out.println(money + accounts[receiver] );*/
		}
		else {
			return "This account does not in use! \nPlease try again later!";
		}
	}
	/**
	 * take money from your account
	 * @param accountNumber  (ask you about your bank number)
	 * @param money (ask you about how much money want you withdraw)
	 */
	public static String getWithdraw(int accountNumber, int money) {
		
		if(accountNumber >= 0 && accountNumber < Configuration.numberAccounts && money < accounts[accountNumber]) {
				return "Your new account balance is: " + String.valueOf(accounts[accountNumber] -= money);					
		}
		
		if(accountNumber >= 0 && accountNumber < Configuration.numberAccounts && accounts[accountNumber] < money) {
				return "Sorry! you don´t have enough money: ";
		}	
		
		return "Please try again later!";
	}
	/**
	 * put money in bank account
	 * @param accountNumber (ask you about your bank number)
	 * @param money (ask you about how much money want you deposit)
	 */
	public static String deposit(int accountNumber, int money) {
		
		if(accountNumber >= 0 && accountNumber < Configuration.numberAccounts && money > 0) {
				accounts[accountNumber] += money;
				return "ok";
		}
		else {
			return "Please try again later!";
		}
	}
}
