package finalfinallyfinalize;

public class FinallyConcept {
	
	public static void main(String[] args) {
		
		test1();
		
	}

	public static void test1() {
		try {
			System.out.println("inside try block");
			throw new RuntimeException("test");
		} catch(Exception e) {
			System.out.println("inside catch block");
		}
		finally {
			System.out.println("inside finally block");
		}
	}
}
