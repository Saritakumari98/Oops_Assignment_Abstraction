package AbstractionAssignment;

abstract class PrepaidCard {
	int cardNo;
	double availablebalance;
	double swipeLimit;
	
	public PrepaidCard(int cardNo, double availablebalance, double swipeLimit) {

		this.cardNo = cardNo;
		this.availablebalance = availablebalance;
		this.swipeLimit = swipeLimit;
	}
	
	abstract boolean swipeCard(double amount);

	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + cardNo + ", availablebalance=" + availablebalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	public double rechargeCard(double amount)
	{
		return availablebalance+=amount;
	}

}
