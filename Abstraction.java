abstract class ATM {
	abstract void withdraw();
	abstract void credit();
	abstract void ministatement();
	void display() {
		System.out.println("This is abstract class method");
	}

}
public class DemoAbs extends ATM {
	@Override
	void withdraw() {
		System.out.println("call respective bank server");
	}
	@Override
	void credit() {
		System.out.println("check account credentials to deposit");	
	}
	@Override
    void ministatement() {
		System.out.println("print the transactions");
		
	}
	public static void main(String[]args) {
		ATM obj=new DemoAbs();
		obj.withdraw();
		obj.credit();
		obj.ministatement();
	}
}

