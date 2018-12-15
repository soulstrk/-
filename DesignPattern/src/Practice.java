
public class Practice {
	
	public static void main(String[] args) {
		test(1,2,3,2,3);
	}
	
	public static void test(int... args) {
		
		for (int is : args) {
			System.out.println(is);
		}
	}
}
