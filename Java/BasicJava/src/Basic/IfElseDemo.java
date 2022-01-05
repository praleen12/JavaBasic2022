package Basic;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =12;
		int num2 = 13;
		
		if (num1>num2) {
			System.out.println("num1 is greater");
		}else {
			if (num1==num2) {
				System.out.println("equal");
			}
		}
		
		
		String result=(num1>num2) ? "num1 is greater": "Dontk know";
		System.out.println(result);
	}

}
