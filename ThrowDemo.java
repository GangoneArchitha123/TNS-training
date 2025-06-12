public class ThrowDemo {
	static void CheckAge(int age) {
		if(age<18)
			throw new ArithmeticException("you were not eligible to vote");
		else
			System.out.println("you were eligible");
	}
	
public class ThrowsDemo {
	static void checkAge(int age)throws ArithmeticException {
		if(age<18)
			System.err.println("you were not eligible to vote");
		else
			System.out.println("you were eligible to vote");
	}
public class ThrowMain {
	public static void main(String[] args) {
      ThrowsDemo.checkAge(6);
	}
}


