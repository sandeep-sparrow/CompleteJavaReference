/**
 * 
 */
package in.github.sandeep.arguments;

/**
 * @author Sandeep Prajapati
 *
 */
public class Test {
	
	int a, b;
	
	public Test(int i, int j) {
		a = i;
		b = j;
	}
	
	void Math(int i, int j) {
		i += 2;
		j *= 2;
		System.out.println("Print i: " +i);
		System.out.println("Print j: " +j);
	}
	
	void Meth(Test o) {
		o.a += 2;
		o.b *= 2;
	}

}
