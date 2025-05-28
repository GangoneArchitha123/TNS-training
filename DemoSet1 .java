public class DemoSet1 {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet();
        hs.add(10);
        hs.add(12);
        hs.add(30);
        hs.add(10);
        hs.add(3);
        for(int i:hs) {
		System.out.println("The data of hashset"+i);
	}
		
	System.out.println("Data from Linkedhashset");
	LinkedHashSet lh=new LinkedHashSet();
		
	lh.add(10);
	lh.add(12);
	lh.add(30);
	lh.add(10);
	lh.add(3);
		System.out.println(lh);
    }
}
