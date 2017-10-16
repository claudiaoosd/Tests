package testStrings;

public class StringTest {

public static void main(String[] args) {

	
		
	String myString = "hello test";
	if (myString.length() < 2)
	{
		System.out.println(myString);
	}
	else
	{
//		System.out.println(myString.substring(0,2));  <--needs charAt to be substring
		System.out.print(myString.charAt(0));
		System.out.println(myString.charAt(1));
	}
}
}




// take a string
// if less than 2 characters then return whatever is in string
// if two or more characters return first 2 characters
// 