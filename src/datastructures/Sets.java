package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		// 1.Define a collection
		//HashSet is a random order ||
		//LinkedHashSet is ORDERED list(in order they were entered)
		//TreeSet rearranges natural / alphabetical order
		
		
		Set<String> animals = new LinkedHashSet<String>(); 
		
		// 2.Adding animals
		
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		System.out.println(animals.size()+""+animals);
		
		animals.add("cat");
		animals.add("snake");
		animals.add("cat");
		animals.add("goose");
		
		System.out.println(animals.size()+""+animals);

		// 3.Create a new set for comparison
		Set<String> farmanimals = new HashSet<String>();
		farmanimals.add("chicken");
		farmanimals.add("cow");
		farmanimals.add("pig");
		farmanimals.add("horse");
		farmanimals.add("dog");
		
		//INTERSECTION set between anmimals and farmanimals set
		
		// 1. Copy the existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);

		//2. Retain ONLY the elements that are in the other set
		
		intersectionSet.retainAll(farmanimals);
		System.out.println("INTERSECTION Set: " +intersectionSet);
		
		
		//UNION set
		Set<String> unionSet = new HashSet<String>(farmanimals);

		unionSet.addAll(animals);
		System.out.println("UNION Set: "+unionSet);
		
		
		//DIFFERENCE Set
		Set<String> differenceSet = new HashSet<String>(animals);

		differenceSet.removeAll(farmanimals);
		System.out.println("DIFFERENCE set:"+differenceSet);
		
		
		
		
		
	}

}
