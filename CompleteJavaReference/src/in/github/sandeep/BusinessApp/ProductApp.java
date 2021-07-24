/**
 * 
 */
package in.github.sandeep.BusinessApp;

import java.util.Scanner;

/**
 * @author Sandeep Prajapati
 *
 */
public class ProductApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Product Selector!");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")) {
			
			System.out.println("Enter Product code");
			String productCode = sc.next();
			sc.nextLine();
			
			Product p = ProductDB.getProduct(productCode);
			
			System.out.println();
			if(p!=null) {
				
//				if(p.getClass().getName().equals("in.github.sandeep."
//						                       + "BusinessApp")){
//					System.out.println("This is a Book Object");
//				}else {
//					System.out.println("This is a Software Object");
//				}
				
				// EASIER WAY TO TEST AN OBJECT'S TYPE
				if(p instanceof Book) {
					System.out.println("This is a Book object");
				}else if (p instanceof Software) {
					System.out.println("This is a Software object");
				}else {
					System.out.println("Invalid object type");
				}
				
				System.out.println(p.toString());
			}else {
				System.out.println("No products Matches this product");
			}
			System.out.println("Product Count: " + Product.getCount());
			
			System.out.println();
			System.out.println("Continue 'y/n' ");
			choice = sc.nextLine();
			System.out.println();
			
		}
		System.out.println();
		System.out.println("Thanks, have a Good day!");
		sc.close();
		
	}

}
