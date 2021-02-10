package Assignment3;

class Book
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book
{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}









public class BookDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b=new Book();
		b.setBookNo(1);
		b.setAuthor("Navneet");
		b.setPrice(2000);
		b.setTitle("Normal Book");
		
		System.out.println((b.getBookNo()));
		System.out.println((b.getAuthor()));
		System.out.println((b.getPrice()));
		System.out.println((b.getTitle()));
		
		
		
		
		EngineeringBook eb =new EngineeringBook();
		eb.setBookNo(2);
		eb.setAuthor("Navneet Nitin");
		eb.setPrice(2500);
		eb.setTitle("Engineering Book");
		eb.setCategory("Theory");
		
		System.out.println((eb.getBookNo()));
		System.out.println((eb.getAuthor()));
		System.out.println((eb.getPrice()));
		System.out.println((eb.getTitle()));
		System.out.println((eb.getCategory()));
		
	}

}
