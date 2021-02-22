import java.util.*;

public class KontoStand {

	public static void main(String[] args) {
		Scanner nummer = new Scanner(System.in);
		
		double kontostand[] = new double[4];
		kontostand[0]= 00.00;
		kontostand[1]= 00.00;
		kontostand[3]= 00.00;
		
		System.out.println("Bitte geben Sie Ihre Kontonummer ein: ");
		
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
	}

}
