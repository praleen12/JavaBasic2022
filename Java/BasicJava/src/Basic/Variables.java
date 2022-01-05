package Basic;

public class Variables {
	
	int j = 20; //instance varibles, need to create object to use it i main method

	public void myMethod() {
		
		int i =20; //local varibales
		j=56;
		
		System.out.println(j);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myno= 10;
		char t='T';
		String str ="Hello";
		
		Variables var= new Variables();
		
		var.myMethod();
		

	}
	


}
