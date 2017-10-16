package testTalkingParrot;

public class testTalkingParrot {

	public static void main(String[] args) {

		boolean talking = true;
		int hours = 21;
		
		
// calls the method parrotTrouble and prints out the result from parrotTrouble
		
		System.out.println(parrotTrouble(talking, hours));

	}
	
	
	static boolean parrotTrouble(boolean talking, int hours) {
		// gets hour of day
		// int hours = dt.getHourOfDay();

		if (hours >= 7 && hours <= 20) {
			return false;

		}

		else if (talking = false) {
			return false;

		}

		else {
			return true;
		}

	}
}

// Pseudo Code
// get if parrot is talking and current hour.
// hour is "current hour" in military format
// Parrot is in trouble before 7 ( <+) and after 20
// parrotTrouble(true,6) then true <-- is talking during 6th hour
// parrotTrouble (true, 7) then false <-- is talking during 7th hour
// parrotTrouble(false,6) --> false <-- is not talking during 6th hour