package in.github.sandeep.arguments;

public class Test1 {

	public int a;
	
	// Constructor
	public Test1(int i) {
		a = i;
	}
	
	// Method returning an object
	Test1 incBy10() {
		Test1 temp = new Test1(a+10);
		return temp;
	}
	
}
