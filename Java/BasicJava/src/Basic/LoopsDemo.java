package Basic;


public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =10;
		while (i>0) {
			
			System.out.println(i);
			i--;
		}

		System.out.println(i);
		
		int j=20;
		do {
			
			System.out.println(j);
			j--;
			
		} while (j==0);
		
		
		
		for (int j2 = 0; j2 < 10; j2++) {
			
			if (j2==5) {
//				break;
				continue;
			}
			
			System.out.println(j2);

			
		}
	}
	
	
	//when to use which look
	//While loop : dont know the iterations
	//do while: atleat execute once
	//for loop: with iterations
	
	
	
	


}
