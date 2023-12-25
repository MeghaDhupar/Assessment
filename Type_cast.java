package Type_cast;

//Performing implicit type casting

public class Type_cast {

	public static void main(String[] args) {
	// create integer type variable
		int n=10;
		System.out.println("The integer value is: " +n);
		
	// convert into double type variable
		double num = n;
		System.out.println("The double vaue is: " +num);

//Performing explicit type casting	

	// create double type variable
		double x=10.99;
		System.out.println("The double value is: " +x);
		
		
	// convert into integer type variable
		int y = (int)x;
		System.out.println("The integer vaue is: " +y);

	}

	
	
}
