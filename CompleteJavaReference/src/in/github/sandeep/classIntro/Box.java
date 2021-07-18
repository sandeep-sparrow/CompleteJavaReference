/**
 * 
 */
package in.github.sandeep.classIntro;

/**
 * @author Sandeep Prajapati
 *
 */
public class Box {
	
	public int width;
	public int height;
	public int length;
	
	// constructor with implicit return class type 
	
	public Box(int x, int y, int z) {
		this.height = x;
		this.width = y;
		this.length = z;
	}
	
	public int Volume() {
		return height * width * length;
	}
	
}
