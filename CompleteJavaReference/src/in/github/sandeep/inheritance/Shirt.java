/**
 * 
 */
package in.github.sandeep.inheritance;

/**
 * @author Sandeep Prajapati
 *
 */
public class Shirt extends Clothing {

	private char fit = '-';
	
	public char getFit() {
		return this.fit;
	}
	
	public void setFit(char fit) {
		this.fit = fit;
	}
	
	public Shirt(int itemId, String desc, char colorCode, double price, char fit) {
		super(itemId, desc, colorCode, price);
		// TODO Auto-generated constructor stub
		this.fit = fit;
	}
	
	public Shirt(char fit) {
		this(0,"-",'-',0.0,fit);
	}
	
	// over writing Display() method from the superclass<Clothing>
	public void Display() {
		System.out.println("--This is Shirt Details-");
		System.out.println("Item Id         : " +this.itemId);
		System.out.println("Item Description: " +this.desc);
		System.out.println("Item Color Code : " +this.colorCode);
		System.out.println("Item Price      : " +this.price);
		System.out.println("Item Size       : " +this.getSize());
	}
	

}
