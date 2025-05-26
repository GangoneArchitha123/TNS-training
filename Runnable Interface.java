public class RunnableDemo implements Runnable {
	Thread t;
	int h, l;
	String msg;
	//constructor
	public RunnableDemo(int l, int h,String msg) {
		this.h = h;
		this.l = l;
		this.msg = msg;
		t = new Thread(this, "Child Thread");
		t.start();
	}
@Override
	public void run() {
		for (int i = l;i<=h;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Error " + e.getMessage());
			}
			System.out.println(msg + i);
		}
	}
}
public class RunnableMain {
	public static void main(String[] args) {
		RunnableDemo ur = new RunnableDemo(10, 20,"Hello");
		Runnable runnable = new Runnable() {
			@Override
			public void run() { // anonymous class
				System.out.println("Runnable with Anonymous Class");
			}
		};
		Thread t1 = new Thread(runnable);
		t1.start();

}}




