 import java.util.Scanner;
public class perimeterRectangle {

	static int sumPerimeter=0;
	static int perimeter =0;

	public static int perimeterOfRectangle(int length, int width) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the length:");
		length =s.nextInt();
		System.out.print("Enter the wideth:");
		width=s.nextInt();
		
		 if (length<= 0 || width<= 0) {
	            throw new IllegalArgumentException("Invalid input: Length and width do not form a rectangle, be enter positive values.");
	        }else {
	        	perimeter = (length + width)*2;
	    		sumPerimeter +=perimeter;
	    		System.out.println("The perimeter of " + length + " and " + width+ " is: " + sumPerimeter+"cm");
	        }
	
		s.close();
		return sumPerimeter; 
       
	}

	public static void main(String[] args) {
		
		perimeterOfRectangle(0, 0);
	}
}


