package Assignment3;

abstract class Medicine
{
	
	int  price,expiryDate;
	abstract void displayLabel();
	
	public Medicine(int price, int expiryDate) {
		super();
		this.price = price;
		this.expiryDate = expiryDate;
	} 
	
	public void getDetails() 
	{
		System.out.println("Price: "+ price);
		System.out.println("Expiry Date: "+expiryDate);
	}

}
class Tablet extends Medicine
{

	public Tablet(int price, int expiryDate) {
		super(price, expiryDate);
		
	}

	@Override
	void displayLabel() {

	System.out.println("Store in Cool And Dry Place");
	}
	
	
	
}

class Syrup  extends Medicine
{

	public Syrup(int price, int expiryDate) {
		super(price, expiryDate);
		
	}

	@Override
	void displayLabel() {
		System.out.println("Store in cool and dry place");
	}
	
	
}

class Ointment extends Medicine

{

	public Ointment(int price, int expiryDate) {
		super(price, expiryDate);
		
	}

	@Override
	void displayLabel() {
		System.out.println("for external use only");
		
	}
	
	
}

public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medicine med1=new Tablet(500,1);
		med1.displayLabel();
		med1.getDetails();
		
		Medicine med2 =new Ointment(400, 2);
		med2.displayLabel();
		med2.getDetails();
		
		Medicine med3=new Syrup(500,3);
		med3.displayLabel();
		med3.getDetails();

	}

}
