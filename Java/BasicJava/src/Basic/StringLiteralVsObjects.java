package Basic;


public class StringLiteralVsObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Good";
		String str2 = "Good";
		
		System.out.println(str1==str2);//true
		System.out.println(str1.equals(str2));//true
		
		String str3= new String("Good");
		String str4= new String("Good");

		
		System.out.println(str1==str3);//false

		System.out.println(str1.equals(str3));//true
		
		
		System.out.println(str3==str4);//false
		
		System.out.println(str3.equals(str4));//true

	
	
		}

}
