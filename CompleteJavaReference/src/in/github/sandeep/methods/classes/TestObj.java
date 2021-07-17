/**
 * 
 */
package in.github.sandeep.methods.classes;

/**
 * @author Sandeep Prajapati
 *
 */
public class TestObj {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// let's create some objects using the constructor 
		
		Test obj1 = new Test(50,40);
		Test obj2 = new Test(50,40);
		Test obj3 = new Test(55,45);
		
		System.out.println("obj1 == obj2? " + obj1.equalTo(obj2));
		System.out.println("obj2 == obj3? " + obj2.equalTo(obj3));

	}

}
