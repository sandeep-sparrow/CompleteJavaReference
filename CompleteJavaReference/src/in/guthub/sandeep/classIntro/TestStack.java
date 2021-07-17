/**
 * 
 */
package in.guthub.sandeep.classIntro;

/**
 * @author Sandeep Prajapati
 *
 */
public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack stack1 = new Stack();
		Stack stack2 = new Stack();
		
		for(int i=0; i<10; i++) stack1.Push(i);
		for(int k=10; k<20; k++) stack2.Push(k);
		
		System.out.println("Stack1:");
		for(int i=0; i<10; i++)
			System.out.println(stack1.Pop());
		
		System.out.println("Stack2:");
		for(int i=0; i<10; i++)
			System.out.println(stack2.Pop());

	}

}
