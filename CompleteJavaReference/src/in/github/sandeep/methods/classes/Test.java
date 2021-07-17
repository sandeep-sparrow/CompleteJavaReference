/**
 * 
 */
package in.github.sandeep.methods.classes;

/**
 * @author Sandeep Prajapati
 *
 */
public class Test {

	// let's build a constructor
	int x, y;
	
	public Test(int a, int b) {
		x = a;
		y = b;
	}
	
	boolean equalTo(Test obj) {
		if(obj.x == x && obj.y == y) return true;
		else return false;
	}
}
