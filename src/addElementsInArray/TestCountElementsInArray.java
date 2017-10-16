package addElementsInArray;

public class TestCountElementsInArray {
	
	public static void main(String[] args) {
		
	
		int[] array1 = new int[]{1,3,7,9};
	
	int sum = 0;
	
	
	for (int i = 0; i < array1.length; i++) {
		
		sum = sum + array1[i];
		
	}
		
	System.out.println(sum);
}
}



// Write a program that sums(add) all elements in an array
//Note: No user input just write the program in Main method
// hint: int[]
// for (int i: arrayName) {}


//Pseudo Code
// create array
// find end of array
// loop through array adding each element as long as you are less than length of array
// print out sum
