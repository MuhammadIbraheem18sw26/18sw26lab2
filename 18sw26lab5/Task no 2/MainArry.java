/*2. Create a java class having an integer type  array as instance variable. Create a function; 
populateArray() to fill in the array by taking user input. 
Create another function for printing the number of even and odd numbers in the array. */
import java.util.*;
class New1{
	int[] arr= new int[5];
	void populateArry()
	{ 
	int a=0;
	Scanner in= new Scanner(System.in);
		for(a=0;a<arr.length;a++)
		{
			 arr[a]=in.nextInt();

		}

	}
	void showEven(){
		System.out.print("Even  Series of Element of Arry  :");
		for(int a=0;a<arr.length;a++)
		{ if(arr[a]%2==0){
		System.out.print(arr[a]+",");}
		}
		}
		
		void showOdd(){
			System.out.print("Odd Series of Elements of Arry :");
		for(int a=0;a<arr.length;a++)
		{ if(arr[a]%2==1){
		System.out.print(arr[a]+",");}
		}
		}
		
		
	}

class MainArry{
	public static void main(String[] args)
	{   int b=0;
	New1 n= new New1();
	System.out.println("Enter Elements of Arry : ");
	n.populateArry();
	n.showEven();
	System.out.println("\n\n");
	n.showOdd();
		

	}
}