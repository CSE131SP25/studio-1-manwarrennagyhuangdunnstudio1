package studio1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.println("The first of two integers to be averaged");
		int n0= in.nextInt();
		System.out.println("The second of two integers to be averaged");
		int n1= in.nextInt();
		System.out.println((n0+n1)/2.0);
	}

}
