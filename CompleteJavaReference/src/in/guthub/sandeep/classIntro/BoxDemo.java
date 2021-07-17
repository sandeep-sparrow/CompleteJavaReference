/**
 * 
 */
package in.guthub.sandeep.classIntro;

/**
 * @author Sandeep Prajapati
 *
 */
public class BoxDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(10,10,50);
		
		var vol = box1.Volume();
		System.out.println("Volume fo BOX: " +vol);
		
		Box box2 = box1;
		
		System.out.println("box2 length: " +box2.length);
		System.out.println("box2 width:  " +box2.width);
		System.out.println("box2 length: " +box2.height);
		
		box2.height = 20;
		
		vol = box1.Volume();
		System.out.println("Volume fo BOX: " +vol);
		
		System.out.println("box2 length: " +box2.length);
		System.out.println("box2 width:  " +box2.width);
		System.out.println("box2 height: " +box2.height);
		
		box1 = null;
		
		System.out.println("box2 length: " +box2.length);
		System.out.println("box2 width:  " +box2.width);
		System.out.println("box2 height: " +box2.height);
		

	}

}
