public class Student implements Comparable<Student>{
	
	public int sid;
	public String name;
	public int age;
	//constructor
	public Student(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	//greater->1,lesser-->-1,equals-->0
	public int compareTo(Student st) {
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}
public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Joyce",23));
		al.add(new Student(103,"Babu",22));
		al.add(new Student(102,"Giva",18));
		al.add(new Student(104,"Harsha",21));
		al.add(new Student(105,"Beena",23));
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.sid+""+st.name+""+st.age);
		}
		
		
	}
}
