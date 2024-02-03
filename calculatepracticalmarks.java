import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		// (a+b/2)+c
		float a,b,c,total,marks;
		System.out.print("ENTER YOUR UNIT TEST FIRST MARKS =");
		a=s.nextInt();
			System.out.print("ENTER YOUR UNIT TEST SECOND MARKS =");
			b=s.nextInt();
			
				System.out.print("ENTER YOUR MAICRO0ROJECT   MARKS =");
		c=s.nextInt();
		
		
		total=(a+b)/2.0f;
	
		marks=total+c;
		System.out.println("THE  CALCULATE MARKS IS ="+""+marks);
		
		
		
	}
}