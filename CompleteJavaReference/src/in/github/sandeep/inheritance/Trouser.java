/**
 * 
 */
package in.github.sandeep.inheritance;

/**
 * @author Sandeep Prajapati
 *
 */
public class Trouser extends Clothing{

	public Trouser(int itemId, String desc, char colorCode, double price) {
		super(itemId, desc, colorCode, price);
		// TODO Auto-generated constructor stub
	}
	
	// over writing Display() method from the superclass<Clothing>
	public void Display() {
		System.out.println("--This is Trousers Details-");
		System.out.println("Item Id         : " +this.itemId);
		System.out.println("Item Description: " +this.desc);
		System.out.println("Item Color Code : " +this.colorCode);
		System.out.println("Item Price      : " +this.price);
		System.out.println("Item Size       : " +this.getSize());
	}

}
