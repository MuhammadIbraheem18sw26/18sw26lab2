/*3. Write a program that reads an integer N and calculates the sum of all integers 1..N. */
import java.util.*;
class IntSum{
	public static void main(String[] args)
	{
		int sum=0;
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the nth value :");
		int input=in.nextInt();
		for( int i =0;i<=input;i++)
		{
			sum=sum+i;
		}
		System.out.print("Sum of the nth terms : "+sum);
	}
}