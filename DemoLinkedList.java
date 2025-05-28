public class DemoLinkedList {
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
		ll.addFirst("Sam");
		ll.addLast("Bindu");
		ll.getFirst();
		System.out.println(ll);
    }
}
