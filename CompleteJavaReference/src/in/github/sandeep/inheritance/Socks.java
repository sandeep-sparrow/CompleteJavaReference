/**
 * 
 */
package in.github.sandeep.inheritance;

/**
 * @author Sandeep Prajapati
 *
 */
public class Socks extends Clothing{

	public Socks(int itemId, String desc, char colorCode, double price) {
		super(itemId, desc, colorCode, price);
		// TODO Auto-generated constructor stub
		
	}
	
	public void Display() {
		System.out.println("--This is Socks Details-");
		System.out.println("Item Id         : " +this.itemId);
		System.out.println("Item Description: " +this.desc);
		System.out.println("Item Color Code : " +this.colorCode);
		System.out.println("Item Price      : " +this.price);
		System.out.println("Item Size       : " +this.getSize());
	}

}
