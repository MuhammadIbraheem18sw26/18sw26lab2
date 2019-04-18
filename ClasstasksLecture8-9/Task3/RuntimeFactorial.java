/*Calculate factorial when a number is supplied on runtime
*/
import java.util.*;
class RuntimeFactorial
{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
	int a=1;
	System.out.println("Enter the Number you want to factorial it :");
  int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
		a=a*i;
	}
	System.out.print("Factorial is : "+a);
}
}