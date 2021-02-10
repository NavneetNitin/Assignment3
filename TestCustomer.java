package que4;


class Address
{
	private String  addressLine,city;

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	String getAddressDetails()
	{
		return addressLine.concat(",").concat(city);
		
	}
}

class Customer
{
	private String customerName;
	private String residentialAddress;
	String officialAddress;
	
	
	
	
	public Customer() {
		System.out.println("This is default Constructor");
	}



	public Customer(String customerName, Address residentialAddress,Address officialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress.getAddressDetails();
		this.officialAddress=officialAddress.getAddressDetails();
	}
	
	void getCustomerDetails()
	{
		System.out.println("Customer: "+customerName);
		System.out.println("Residential Address: "+residentialAddress);
		System.out.println("Official Address: "+officialAddress);
	}
		
	
}


public class TestCustomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Address addr = new Address("1st main HSR Layout", "Banglore");
		 Address addr1=new Address("1st Main Electronics city","Banglore");
		 Customer customer =new Customer("John ",addr,addr1);
		 customer.getCustomerDetails();
		

	}
}
