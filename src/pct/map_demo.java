package pct;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class map_demo {

	public static LinkedList<Integer> addData(int data, LinkedList<Integer> list)
	{
		list.add(data);
		return list;
	}
	
	public static void main(String[] args) 
	{
		HashMap<String, LinkedList<Integer>> map = new HashMap<String, LinkedList<Integer>>();
		
		map.put("divya1", new LinkedList<Integer>());
		map.put("divya2", new LinkedList<Integer>());
		map.put("divya3", new LinkedList<Integer>());
		map.put("divya4", new LinkedList<Integer>());
		map.put("divya5", new LinkedList<Integer>());

		//Set keys = map.keySet();
		//keys.forEach(key -> System.out.println(key));
		
		map.put("divya1",  addData(1, map.get("divya1"))); 
		map.put("divya2",  addData(2, map.get("divya2")));
		map.put("divya3",  addData(3, map.get("divya3")));
		map.put("divya4",  addData(4, map.get("divya4")));
		map.put("divya5",  addData(5, map.get("divya5")));
		
		//Collection<LinkedList<Integer>> values =  map.values();
		//values.forEach(value -> System.out.println(value));
		
		map.forEach((key,value) -> System.out.println(key +" "+value));
		
		float f = 0.025f;
		
		System.out.println(Float.toString(f)+"6");
		
	}

}
