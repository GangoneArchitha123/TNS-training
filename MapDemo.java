public class MapDemo {
	public static void main(String[] args) {
Map<String,Integer> mp=new HashMap<String,Integer>();
		
		mp.put("Bobby",78);
		mp.put("Joel", 98);
		mp.put("harsha",67);
		mp.put("harsha",67);
for(Map.Entry<String,Integer> entry:mp.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+":"+value);
		}
	System.out.println("The Linked Hashmap data");	
