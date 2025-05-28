public class DemoCollection {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList();
		al.add(10);
		al.add(12);
		al.add(30);
		al.add(10);
		al.add(30);
		
		for(int i:al) {
			System.out.println("The data"+i);
		}
		
		Set<Integer> hs=new HashSet();
		hs.add(10);
		hs.add(12);
		hs.add(30);
		hs.add(10);
		hs.add(3);
		
	for(int i:hs) {
		System.out.println("The data of hashset"+i);
    }
}
}
