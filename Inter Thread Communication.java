public class DemoThreadComm {
	
	int i;
	boolean flag=false;
	
	synchronized void deliver(int i) {
		if(flag)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.err.println("Exception caught");
		}
		this.i=i;
		flag=true;
		System.out.println("Data delievred"+i);
		notify();
	}
	
	synchronized int receive() {
		if(!flag)
			try {
				wait();
			}
		catch(InterruptedException e) {
			System.err.println("Exception caught");
		}
		
		System.out.println("Data received"+i);
		flag=false;
		notify();
		return i;
	}
}
public class Thread1 extends Thread {
    DemoThreadComm ob;
	
	Thread1(DemoThreadComm ob){
		this.ob=ob;
	}
	
	public void run() {
		for(int j=1;j<5;j++) {
			ob.deliver(j);
		}
    }
}
public class Thread2 extends Thread {
	DemoThreadComm ob;
	Thread2(DemoThreadComm ob){
		this.ob=ob;
	}
	
	public void run() {
		for(int k=0;k<=5;k++) {
			 ob.receive();
		}
	}
}
public class Communication {
	public static void main(String[] args) {
		DemoThreadComm ob=new DemoThreadComm();
		Thread1 t1=new Thread1(ob);
		Thread2 t2=new Thread2(ob);
		t1.start();
		t2.start();
	}
}

    
