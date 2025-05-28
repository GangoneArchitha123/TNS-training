public class DemoSync{
    synchronized static void printTable(int n) throws InterruptedException {
		for(int i=0;i<5;i++) {
			System.out.println(n*i);
			Thread.sleep(600);
		}
	}
	
	public static void main(String arg[]) {
		
		Thread t1=new Thread() {
			public void run() {
				try {
					DemoSync.printTable(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t2=new Thread() {
			public void run() {
				try {
					DemoSync.printTable(4);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		t1.start();
		t2.start();
	}	

    
}
