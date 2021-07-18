/**
 * 
 */
package in.github.sandeep.LineItemApp;

import java.util.Scanner;

/**
 * @author Sandeep Prajapati
 *
 */
public class LineItemApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Line Item Calculator!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			String productCode = Validator.getString(sc, 
					"Enter Product Code ");
			
			int quantity = Validator.getInt(sc, 
					"Enter Quantity ", 1000, 0);
			
			Product product = 
					ProductDB.getProduct(productCode);
			
			LineItem lineitem = new LineItem();
			lineitem.setProduct(product);
			lineitem.setQuantity(quantity);
			
			System.out.println();
			System.out.println("Line Item");
			System.out.println("Code       : " +product.getProductCode());
			System.out.println("Description: " +product.getDescription());
			System.out.println("Price      : " +product.getPrice());
			System.out.println("Quantity   : " +lineitem.getQuantity());
			System.out.println("Total      : " +
						lineitem.getFormattedTotal() + "\n");
			
			choice = Validator.getString(sc, "Continue 'y/n' ");
			System.out.println();
			
		}
		System.out.println("Thanks for Shopping with us!");
		sc.close();

	}

}
