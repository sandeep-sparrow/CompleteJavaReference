/**
 * 
 */
package in.github.sandeep.arguments;

/**
 * @author Sandeep Prajapati
 *
 */
public class byValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		a = 10;
		b = 20;
		
		Test test1 = new Test(a,b);

		test1.Math(a,b);
		
		System.out.println("Before the call");
		System.out.println("Print a: " +test1.a);
		System.out.println("Print b: " +test1.b);
		
		test1.Meth(test1);
		
		System.out.println("After the call");
		System.out.println("Print a: " +test1.a);
		System.out.println("Print b: " +test1.b);
		
		

	}

}
