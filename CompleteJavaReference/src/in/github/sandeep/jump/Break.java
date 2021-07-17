/**
 * 
 */
package in.github.sandeep.jump;

/**
 * @author Sandeep Prajapati
 *
 */
public class Break {

	/**
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean t = true;
		
		first:{
			second:{
				third:{
					System.out.println("Before the break");
					if(t) break second;
					System.out.println("This won't execute");
				}
				System.out.println("This won't executed");
			}
			System.out.println("This is the end of second block!");
		}

	}

}
