public class LinkedList {
	public static void main(String[] args) {
		//two ways of initialization
		LinkedList<String> ll=new LinkedList();
		
		List l=new LinkedList();
		
		//adding of data
		ll.add("booby");
		ll.add("Vicent");
		ll.add("Swetha");
		ll.add("Abhi");
		ll.add("Swetha");
		ll.add(null);
        Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println("The data is"+it.next());
		}
		
		System.out.println("The data after removing");
		ll.remove(2);
		for(String s:ll) {
			System.out.println("The data"+s);
		}
		
		Stack s=new Stack();
		s.push(10);
		s.push(23);
		s.push(2);
		s.push(45);
		//s.pop();
		System.out.println(s);
	}
}

        
