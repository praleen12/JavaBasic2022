package oops;

public class AccountHolders {
	
	String firstName;
	String lastName;
	int age;
	float bal;
	boolean eligibility;
	
	public boolean checkEligibility() {
		
		if (age>21 && bal>20000) {
			eligibility = true;
			
		}
		return eligibility;
		
	}

}
