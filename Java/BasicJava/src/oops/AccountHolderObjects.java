package oops;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
		

		AccountHolders tom = new AccountHolders();
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.age= 21;
		tom.bal = 22000;
		
		
		System.out.println("Tom eligibility is: " + tom.checkEligibility());
		
		
	}

}
