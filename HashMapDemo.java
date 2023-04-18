package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> Hm=new HashMap<>();
		Hm.put(1, "priyanka");
		Hm.put(2, "nitin");
		Hm.put(30, "kiyansh");
		Hm.put(4, "Arohi");
		Hm.put(52, "Yesh");
		Hm.put(23, "Ganesh");
		Hm.put(44, "sagar");
		Hm.put(12, "");
		
		for(Entry<Integer, String> hmm:Hm.entrySet()) {
			System.out.println("key is:"+hmm.getKey()+"value is:"+hmm.getValue());
		}

	}

}
