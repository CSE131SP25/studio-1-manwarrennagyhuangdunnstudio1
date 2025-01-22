package studio1;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if divisible by 4, not evenly divisible by 100 with exception that if is evenly divisible by 400
		
			Scanner in = new Scanner(System.in);
	
			System.out.print("Enter a year: ");
			int year = in.nextInt();
			
			if(year % 4 == 0)
			{
				if(year % 100 == 0 || year % 400 !=0)
				{
					System.out.println(year + " is not a leap year");
				}
			
				System.out.println(year + " is a leap year");
			}
			
			else
			{
				System.out.println(year + " is not a leap year");
			}
			
			
	}

}
