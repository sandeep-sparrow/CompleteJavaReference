/**
 * 
 */
package in.github.sandeep.classIntro;

/**
 * @author Sandeep Prajapati
 *
 */
public class Stack {
	
	int stk[] = new int[10];
	int tos;
	
	// initialize the stack
	public Stack() {
		tos = -1;
	}
	
	// push method 
	public void Push(int i) {
		if(tos == 9) {
			System.out.println("Stack is Full");
		}else {
			stk[++tos] = i;
		}
	}
	
	// pop method
	public int Pop() {
		if(tos < 0) {
			System.out.println("Stack UnderFlow");
			return 0;
		}else {
			return stk[tos--];
		}
	}

}
