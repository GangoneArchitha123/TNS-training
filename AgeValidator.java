public class AgeValidator {
     static void validateAge(int age) throws InvalidAgeException {
     if (age<18) {
          throw new InvalidAgeException("Invalid age. You are not eligible to vote.");
      }
   }
}
ublic class VoterInfo {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		try {
			AgeValidator.validateAge(age);
			this.age = age;
		} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
		}		
	}
	
	@Override
	public String toString() {
		return "VoterInfo [name=" + name + ", age=" + age + "]";
	}
}
public class Main {
	public static void main(String[] args) {
		StudentInfo obj=new StudentInfo();
		obj.setRollNo(10);
		obj.setName("Pooja");
		obj.setPer(89);
		obj.show();
		
		System.out.println("Enter Name and Age");
		Scanner sc=new Scanner(System.in);
		VoterInfo obj1=new VoterInfo();
		obj1.setName(sc.next());
		obj1.setAge(sc.nextInt());
		if (obj1.getAge()!=0)
			System.out.println(obj1);
	}
}

