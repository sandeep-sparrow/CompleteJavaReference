/**
 * 
 */
package in.github.sandeep.inheritance;

/**
 * @author Sandeep Prajapati
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Clothing garment1 = new Socks(101,"Red Socks",'B',5.75);
		garment1.setSize('M');
		
		Clothing garment2 = new Shirt(102,"Grey Shirt",'G',7.25,'S');
		garment2.setSize('S');
		
		Clothing garment3 = new Trouser(103,"Green Trouser",'G',9.99);
		garment3.setSize('M');
		
		Clothing[] allClothes = {garment1, garment2, garment3};
		
		System.out.println("***Start Of Data***\n");
		for(Clothing C: allClothes) {
			C.Display();
			if(C instanceof Shirt) {
				char fit = ((Shirt)C).getFit();
				System.out.println("--This Shirt has a Fit of: " +fit+ " --");
			}
			System.out.println("\n");
		}
		System.out.println("***End Of Data***\n");
		
		// shirt1.getFit();
		// Casting
		char fit = ((Shirt)garment2).getFit();
		System.out.println("fit for Shirt is: " +fit);
		

	}

}
