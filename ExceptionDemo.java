public class ExceptionDemo {
    public static void divide(int a,int b) {
		int result;
		try {
			result=a/b;
			System.out.println(result);	
		}
	catch(Exception e) {
		System.err.println(e.getMessage());
	}
		finally {
			System.out.println("hello welcome");
		}
	}    
}
ublic class ExceptionMain {
    public static void main(String[] args) {
		ExceptionDemo.divide(12, 3);
		ExceptionDemo.divide(12, 0);
	}  
}
