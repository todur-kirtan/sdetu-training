package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// 1.Create a collection
		ArrayList<String> cities = new ArrayList<String>();  //ArrayList<String> specifies array list to strings ony strings only.
		
		// 2.Add elements
		cities.add("Cleveland");
		cities.add("Toronto");
		cities.add("Chicago");
		cities.add("Miami");
		
		// 3.Iterate the collection.
		for(String city : cities) {
			System.out.println(city);
		}
		
		// 4.Get the size
		
		int size = cities.size();
		System.out.println("There are  "+ size + " in the collection");
		
		// 5.Retrieve specific element
		System.out.println(cities.get(0));
		
		// 6.Remove
		System.out.println(cities.remove(2));
		size = cities.size();
		System.out.println("There are  "+ size + " in the collection");

		for(String city : cities) {
			System.out.println(city);
		}

	}

}
