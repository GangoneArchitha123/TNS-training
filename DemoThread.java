package Demothread;

public class DemoThread extends Thread{
		public void run() {
			try {
				System.out.println("This thread is" + Thread.currentThread().getName()+"running");
			}
			catch(Exception e) {
				System.out.println("Exception caught");
			}
		}

	}



