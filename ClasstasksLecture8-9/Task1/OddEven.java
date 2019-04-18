/*Generate a series of Odd number and even number using for and
while loop.*/
class OddEven{
public static void main(String[] args)
{
	int even=0;
	System.out.println("Odd numbers :");
	for(int odd =1; odd<=50;odd+=2)
	{System.out.print(odd+", ");}
System.out.println();
System.out.println("Even numbers : ");
while(even<=50){
	System.out.print(even+", ");
	even+=2;
}
	
}}