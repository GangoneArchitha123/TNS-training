public class Dog {
	public void eat() {
		System.out.println("Eating to be healthy");
	}
	public void sounds() {
		System.out.println("the dog barks");
	}
}
public class Cow extends Dog{
	public void sounds() {
		System.out.println("the cow says moh moh");
	}

}
public class Horse extends Dog{
	public void sounds() {
		System.out.println("the horse says neigh neigh");
	}

}
public class Animals {
	public static void main(String[]args) {
		Dog d=new Dog();
		d.eat();
		d.sounds();
		Cow c=new Cow();
		c.eat();
		c.sounds();
		Horse h=new Horse();
		h.eat();
		h.sounds();
		
		
		
	}

}
