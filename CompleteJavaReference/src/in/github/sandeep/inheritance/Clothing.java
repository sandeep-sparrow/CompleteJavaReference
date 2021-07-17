/**
 * 
 */
package in.github.sandeep.inheritance;

/**
 * @author Sandeep Prajapati
 *
 */
public abstract class Clothing {
	
	public int itemId = 0;
	public String desc = "--description required-";
	public char colorCode = 'U';
	public double price = 0.0;
	private char size = '-';
	
	public Clothing(int itemId, String desc, char colorCode, double price) {
		this.itemId = itemId;
		this.desc = desc;
		this.colorCode = colorCode;
		this.price = price;
	}
	
	public abstract void Display();
//	{
//		System.out.println("--This is Clothing Details-");
//		System.out.println("Item Id         : " +this.itemId);
//		System.out.println("Item Description: " +this.desc);
//		System.out.println("Item Color Code : " +this.colorCode);
//		System.out.println("Item Price      : " +this.price);
//		System.out.println("Item Size       : " +this.getSize());
//	}
	
	public void setSize(char size) {
		this.size = size;
	}

	public char getSize() {
		return size;
	}

}
