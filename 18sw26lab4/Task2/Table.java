import java.util.*;
class Table{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number of table :");
	int a=sc.nextInt();
	System.out.println("Enter the Starting point : ");
	int b=sc.nextInt();
	System.out.println("Enter the Ending point : ");
	int c=sc.nextInt();
	for(int i=b;i<=c;i++)
	{
		System.out.println(a+" X "+b+"="+(b*a));
		b++;
	}
}}