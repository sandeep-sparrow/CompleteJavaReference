package in.github.sandeep.productApp;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Product Selector");
		System.out.println();
		
		Scanner scan1 = new Scanner(System.in);
		
		String choice = "y";
		while(choice.equalsIgnoreCase("y")){
			// get the input from user
			System.out.print("Enter product code: ");
			String productCode = scan1.next();
			scan1.nextLine();
			
			Product product = ProductDB.getProduct(productCode);
			
			System.out.println();
			System.out.println("Selected Product is:");
			System.out.println("Description : " +product.getDescription());
			System.out.println("Price       : " +product.getPrice());
			System.out.println("Product Code: " +product.getProductCode());
			System.out.println();
			
			System.out.println("Continue Y/N?");
			choice = scan1.nextLine();
			System.out.println();
		}
		scan1.close();
		
	}

}
