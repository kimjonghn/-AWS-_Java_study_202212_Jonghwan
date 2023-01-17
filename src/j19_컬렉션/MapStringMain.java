package j19_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapStringMain {
	
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();//hach값은 순서대로 나옴
		
		strMap.put("a","이종현");
		strMap.put("e","진채희");
		strMap.put("c","김재영");
		strMap.put("d","이상현");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));
		
		for(String k : strMap.keySet()){
			System.out.println("key: " + k);
			System.out.println(strMap.get(k));
		}
		
		for(String v : strMap.values()) {
			System.out.println("value: " + v);
		}
		
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
			System.out.println();
		}
		
		System.out.println("==================");
		
		strMap.forEach((k, v) -> {
			System.out.println("key: " + k);
			System.out.println("value: " + v);
		});
	}
}
