package AbstractionAssignment;

import java.util.Scanner;

public class TestCard {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Card Number");
		int cardno=sc.nextInt();
		sc.close();
		
		TravelCard tc=new TravelCard(cardno,5000.00,700);
		
		tc.swipe(1000);
		tc.displayCardDetails();
	
	
		

	}

}
