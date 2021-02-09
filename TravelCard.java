package AbstractionAssignment;

public class TravelCard extends PrepaidCard implements Rewardable{
	int rewardPoints;

	public TravelCard(int cardNo, double availablebalance, double swipeLimit) {
		super(cardNo, availablebalance, swipeLimit);
		
	}

	@Override
	public int calRewardPoints(double amount) {
		if(swipe(amount)==100)
			 rewardPoints+=5;
		
		return rewardPoints;
		
	}

	@Override
	boolean swipeCard(double amount) {
		if(amount<swipeLimit || amount<availablebalance)
		  return true;
		
		else
		return false ;
	}
	
	double swipe(double amount)
	{
		if(swipeCard(amount)==true)
		{    double inr=amount*60;
			availablebalance=availablebalance-(inr*5/100);
		}
		return availablebalance;
	}
	
	void displayCardDetails()
	{
		System.out.println("Your Card Number is "+cardNo);
		System.out.println("Your Availebalance is "+availablebalance+"INR");
		System.out.println("Your SwipeLimit is "+swipeLimit);
	}

}
