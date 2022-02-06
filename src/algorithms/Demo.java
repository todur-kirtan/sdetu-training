package algorithms;

public class Demo {

	public static void main(String[] args) {
		int[] numbers = {12, 234, 435, 2345, 765, 5, 4345, 66, 3534, 65, 0, 3, 5, 6, 4, 1};
		int[] sortedNumbers = {12,23,455,567,656,696,764,878,934,1000,};
		
		//Call a linearSearch function that searches for a specific number
		int pos = algorithms.Search.linearSearch(numbers, 5);
		System.out.println("Found at position: "+ pos);
		
		//Call the binarySearch function
		int index = algorithms.Search.binarySearch(sortedNumbers, 1000, 0, sortedNumbers.length-1);
		System.out.println("Found at position: "+ index);
		
		//Call the bubbleSort Function
		
		algorithms.Sort.bubbleSort(numbers);

	}
	

}
