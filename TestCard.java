package Assignment3;

interface Rewardable
{
	int calculateRewardPoint(double amount);
}

abstract class PrepaidCard
{
	
	 int CardNo;
	 double availableBalance, swipeLimit;
	 
	abstract boolean swipeCard(double amount);
	
	



	@Override
	public String toString() {
		return "PrepaidCard [CardNo=" + CardNo + ", availableBalance=" + availableBalance + ", swipeLimit=" + swipeLimit
				+ "]";
	}
	
	void rechargeCard(double amount) 
	{
		 availableBalance=availableBalance+amount;
		 System.out.println("Available balance = "+availableBalance);
		
	}
	
	
	
}
class TravelCard extends PrepaidCard implements Rewardable 
{
	int RewardPoint;
	
	

	@Override
	public int calculateRewardPoint(double amount) {
		int amountInRupee=(int) (amount*60);
		RewardPoint=amountInRupee/100;
		return RewardPoint;
	}

	@Override
	boolean swipeCard(double amount) {
		
		double swipedAmount=amount*60;
		if(swipedAmount<=super.availableBalance)
				{
				 calculateRewardPoint(amount);
			     availableBalance=availableBalance-(swipedAmount+5/100*swipedAmount);
			     System.out.println("After Swipe:New Available balance is "+availableBalance);
			     System.out.println("Total Reward point is "+ RewardPoint);
			     return true;
				}
		else {
			return false;
		}
	}	
	
}
	





public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TravelCard t=new TravelCard();
		
		t.rechargeCard(600000);
		String Details=t.toString();
		System.out.println(Details);
		
	
		t.swipeCard(600);
		t.swipeCard(4000);
	}

}
