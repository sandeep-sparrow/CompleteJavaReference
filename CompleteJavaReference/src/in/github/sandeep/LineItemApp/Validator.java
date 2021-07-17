/**
 * 
 */
package in.github.sandeep.LineItemApp;

import java.util.Scanner;

/**
 * @author Sandeep Prajapati
 *
 */
public class Validator {
	
	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public static double getDouble(Scanner sc, String prompt) {
		
		double d = 0.0;
		boolean isValid = false;
		
		while(isValid == false) {
			System.out.println(prompt);
			if(sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			}
			else {
				System.out.println("Invalid decimal value entered,"
					 + "Try Again");
			}
			sc.nextLine();
		}
		return d;
	}
	
	public static double getDouble(Scanner sc, String prompt, 
			double dmax, double dmin) {
		
		double d = 0.0;
		boolean isValid = false;
		
		while(isValid==false) {
			
			d = getDouble(sc, prompt);
			if(d<=dmin) {
				System.out.println(
						"Error! Decimal must be greater then " + dmin + ".");
			}else if(d>=dmax) {
				System.out.println(
						"Error! Decimal must be lesser then " + dmax + '.');
			}else {
				isValid = true;
			}
		}
		return d;
	}
	
	public static int getInt(Scanner sc, String prompt) {
		
		int i = 0;
		boolean isValid = false;
		
		while(isValid == false) {
			System.out.println(prompt);
			if(sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			}
			else {
				System.out.println("Invalid Integer value entered,"
					 + "Try Again");
			}
			sc.nextLine();
		}
		return i;
	}
	
	public static int getInt(Scanner sc, String prompt, int imax, int imin) {
		
		int i = 0;
		boolean isValid = false;
		
		while(isValid==false) {
			
			i = getInt(sc, prompt);
			if(i<=imin) {
				System.out.println(
						"Error! Number must be greater then " + imin + ".");
			}else if(i>=imax) {
				System.out.println(
						"Error! Number must be lesser then " + imax + '.');
			}else {
				isValid = true;
			}
		}
		return i;
	}
	
	

}
