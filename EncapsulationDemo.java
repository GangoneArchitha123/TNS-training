public class EncapsulationDemo {
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid=sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname=sname;
	}
	public void display() {
		System.out.println("The student are"+sid+sname);
	}

}
public class Main {
	public static void main(String []args) {
		EncapsulationDemo obj=new EncapsulationDemo();
		obj.setSid(102);
		obj.setSname("architha");
		System.out.println(obj.getSid());
		System.out.println(obj.getSname());
		}

}
