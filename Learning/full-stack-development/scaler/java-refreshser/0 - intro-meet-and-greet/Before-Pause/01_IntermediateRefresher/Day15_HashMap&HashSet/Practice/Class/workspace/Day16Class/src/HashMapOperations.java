import java.util.HashMap;

public class HashMapOperations {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap=new HashMap<String, Integer>();
		System.out.println(hmap);
		
		hmap.put("MH", 100);
		hmap.put("HN", 20);
		hmap.put("PN", 18);
		hmap.put("GOA", 8);
		
		System.out.println(hmap);
		
		//contains
		System.out.println(hmap.containsKey("GOA"));
		System.out.println(hmap.containsKey("DELHI"));
		
		//get
		System.out.println(hmap.get("MH"));
		System.out.println(hmap.get("DELHI"));
		
		//update
		hmap.put("HN", 10);
		System.out.println(hmap);
		
		//remove
		hmap.remove("PN");
		System.out.println(hmap);
		
		//print
		//hm.keySet()  ->  returns a set of keys of HashMap
		//use keys to iterate over HashMap
		for(String str:hmap.keySet())
			System.out.println(str+" "+hmap.get(str));
 
	}

}
