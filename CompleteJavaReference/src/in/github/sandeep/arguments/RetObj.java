package in.github.sandeep.arguments;

public class RetObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1 test1 = new Test1(5);
		
		Test1 test2;
		
		test2 = test1.incBy10();

		System.out.println("test1.a: " +test1.a);
		System.out.println("test2.a: " +test2.a);
		
		test2 = test2.incBy10();
		
		System.out.println("test2.a: after 2nd increment " +test2.a);
		
	}

}
