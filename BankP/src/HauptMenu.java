import java.util.*;
public class HauptMenu {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Hauptmen�: \n 1- Kontostand \n 2- �berweisen: \n 3- Geld abheben: \n 4- Geld draufbuchen: " );
		
		System.out.println("Bitte w�hlen eine Nummer: ");
		
		int nummer = userInput.nextInt();
		
		if(nummer == 1) {
			KontoStand();			
		}
		if(nummer == 2) {
			�berweisen();			
		}
		if(nummer == 3) {
			GeldAbheben();			
		}
		if(nummer == 4 ) {
			System.out.println("Hi");			
		}
		userInput.close();
	}

	private static void KontoStand() {
			Scanner nummer = new Scanner(System.in);
			
			double kontostand[] = new double[4];
			kontostand[0]= 1000.00;
			kontostand[1]= 1000.00;
			kontostand[3]= 1000.00;
			
			System.out.println("Bitte geben Sie Ihre Kontonummer ein: ");
			
			boolean nummerFalsch = false;
			
			int kontoNummer = nummer.nextInt();
			
			if(kontoNummer == 1) {
				System.out.println(kontostand[0]);
			}
			if(kontoNummer == 2) {
				System.out.println(kontostand[1]);
			}
			if(kontoNummer == 3) {
				System.out.println(kontostand[2]);
			}
			nummer.close();
			if(!nummerFalsch) {
				System.out.println("Bitte versuch noch mal sp�ter!");
			}
	}
	private static void �berweisen() {
		
		Scanner nummer = new Scanner(System.in);
		Scanner geld = new Scanner(System.in);
		Scanner andereKontoNummer = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie Ihre Kontonummer ein: ");
		
		int kontoNummer = nummer.nextInt();
		boolean nummerFalsch = false;
				
		if(kontoNummer == 1) {
			System.out.println("Wie viel Geld m�chten Sie �berweisen? ");
			int dasGeld = geld.nextInt();
			if(dasGeld >= 0) {
				System.out.println("An welche Konto m�chten Sie das Geld �berweisen? ");
				int empfangKonto = andereKontoNummer.nextInt();
				
				if(empfangKonto == 1) {
					System.out.println("Sie k�nnen kein Geld aud Ihr Konto selbst �berweisen");
				}
				if(empfangKonto == 2) {
					/* kontostand[1] - dasGeld*/
					System.out.println("kontostand[1] + dasGeld");
				}
				if(empfangKonto == 3) {
					
					System.out.println("kontostand[2] + dasGeld");
				}
				
				if(empfangKonto > 3 ) {
					System.out.println("diese Konton existiert nicht!");
				}
				if(empfangKonto <= 0 ) {
					System.out.println("diese Konton existiert nicht!");
				}
			}
		}
		if(kontoNummer == 2) {
			System.out.println("Wie viel Geld m�chten Sie �berweisen? ");
			int dasGeld = geld.nextInt();
			if(dasGeld >= 0) {
				
				System.out.println("An welche Konto m�chten Sie das Geld �berweisen? ");
				int empfangKonto = andereKontoNummer.nextInt();
				
				if(empfangKonto == 1) {
					/* kontostand[1] - dasGeld*/
					System.out.println("kontostand[0] + dasGeld");
				}
				if(empfangKonto == 2) {
					System.out.println("Sie k�nnen kein Geld aud Ihr Konto selbst �berweisen");
				}
				if(empfangKonto == 3) {
					/* kontostand[1] - dasGeld*/
					System.out.println("kontostand[2] + dasGeld");
				}
				if(empfangKonto > 3 ) {
					System.out.println("diese Konton existiert nicht!");
				}
				if(empfangKonto <= 0 ) {
					System.out.println("diese Konton existiert nicht!");
				}
			}
		}
		if(kontoNummer == 3) {
			System.out.println("Wie viel Geld m�chten Sie �berweisen? ");
			int dasGeld = geld.nextInt();
			if(dasGeld >= 0) {
				
				System.out.println("An welche Konto m�chten Sie das Geld �berweisen? ");
				int empfangKonto = andereKontoNummer.nextInt();
				
				if(empfangKonto == 1) {
					/* kontostand[2] - dasGeld*/
					System.out.println("kontostand[0] + dasGeld");
				}
				if(empfangKonto == 2) {
					/* kontostand[2] - dasGeld*/
					System.out.println("kontostand[1] + dasGeld");
				}
				if(empfangKonto == 3) {
					System.out.println("Sie k�nnen kein Geld aud Ihr Konto selbst �berweisen");
				}
				if(empfangKonto > 3 ) {
					System.out.println("diese Konton existiert nicht!");
				}
				if(empfangKonto <= 0 ) {
					System.out.println("diese Konton existiert nicht!");
				}
				
			}
		}
		if(!nummerFalsch) {
			System.out.println("Bitte versuch noch mal sp�ter!");
			
		}
		
	nummer.close();
	geld.close();
	andereKontoNummer.close();
	}
	private static void GeldAbheben() {
		
		
	}
}
