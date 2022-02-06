package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		
		//Implement Map interface
		Map<Integer,String> hMap = new TreeMap<Integer,String>();
		mapUtil(hMap);
		
	}
	
	public static void mapUtil(Map<Integer,String> map) {
		
		// 1.Add Key-Value pair
		map.put(101, "Steve");
		map.put(230, "Roger");
		map.put(398, "Jennifer");
		map.put(488, "Milka");
		map.put(739, "Kelly");
		
		// 2.Expose/Access elements
		System.out.println("See all Keys:" + map.keySet());
		System.out.println("See all Key-Value pair:" + map);
		
		// 3. Iterate through Key-Value pair
		
		for(int key : map.keySet()) {
			System.out.println("[Key: " +key+". Value: "+map.get(key)+"]");
		}


	}

}
