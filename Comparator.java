public class Employee {
	
	public int eid;
	public String ename;
	public float esal;
	
	public Employee(int eid, String ename, float esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
}
public class Ename implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		
				return e1.ename.compareTo(e2.ename);
	}
}
public class Esal implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		//24k,35k,28k,38
		if(e1.esal==e2.esal)
		return 0;
		else if(e1.esal>e2.esal)
			return 1;
		else
			return -1;
		
	}
}
public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList();
		al.add(new Employee(101,"Allen",24000.89f));
		al.add(new Employee(102,"Giva",34000.89f));
		al.add(new Employee(101,"Bobby",21000.98f));
		System.out.println("sorting based on name");
		Collections.sort(al,new Ename());
		for(Employee e:al) {
			System.out.println(e.eid+""+e.ename+""+e.esal);
		}
		
		
		System.out.println("sorting based on salary");
		Collections.sort(al,new Esal());
		for(Employee e:al) {
			System.out.println(e.eid+""+e.ename+""+e.esal);
		}	
	}
}
