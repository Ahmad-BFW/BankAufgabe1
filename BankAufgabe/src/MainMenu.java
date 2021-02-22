import java.util.*;
/**
 * 
 * @author akhalil
 * call the methods
 */
public class MainMenu {	
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		while(true) {
		System.out.println("Main menu: \n\n 1- Balance \n 2- Transfer: \n 3- Withdraw: \n 4- Deposit: \n 5- exit:" );

		System.out.println("\nPlease choose an option: ");
		
		int number = userInput.nextInt();

		
		if(number == 1) {
			System.out.println("\nPlease enter your account number: ");
			int accountNumber = userInput.nextInt();
			String result = OptionsClass.getBalance(accountNumber);
			System.out.println(result);
			/*System.out.println(getBalance(accountNumber));*/
		}
		if(number == 2) {
			System.out.println("Please enter your account number: ");
			int sender = userInput.nextInt();
			System.out.println("How much money do you want to transfer? ");
			int money = userInput.nextInt();
			System.out.println("To which account would you to transfer this money? ");
			int receiver = userInput.nextInt();
			String result = OptionsClass.getTransfer(sender, money, receiver);
			System.out.println(result);
			
		}
		if(number == 3) {
			System.out.println("Please enter your account number: ");
			int accountNumber = userInput.nextInt();
			System.out.println("How much money do you want to Withdraw? ");
			int money = userInput.nextInt();
			String result = OptionsClass.getWithdraw(accountNumber, money);
			System.out.println(result);
		}
		if(number == 4 ) {
			System.out.println("How much money do you want to deposit? ");
			int money = userInput.nextInt();
			System.out.println("Please enter your account number: ");
			int accountNumber = userInput.nextInt();
			String result = OptionsClass.deposit(accountNumber, money);
			System.out.println(result);
			
		}
		if(number == 5 ) {
			System.out.println("Bye");
			userInput.close();
			break;
		}
		if(number > 5 ) {
			System.out.println("Please enter one of the number from the list above!");
		}
		}
	}	
	
}