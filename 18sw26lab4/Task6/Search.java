/*6. Write java code that takes a value at runtime and searches it in the array. 
If the value appears in the array then it prints the position
of the value or else prints a message that value is not found.*/
import java.util.*;
class Search{
	public static void main(String[] args)
	
	{
		int count=0;
		int b=0;
		Scanner in=new Scanner(System.in);
		int[] arr={1,3,4,5,7,9,6};
		System.out.print("Enter your Number : ");
		int a=in.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			
			if(a==arr[i])
			{
				System.out.print("your no is found on "+(count+1)+" position");
				
				b++;
			}
			
			count++;
			}
			
			if(b==0)
			{
			System.out.print("Sorry Number not found");
			}
		
	}
}