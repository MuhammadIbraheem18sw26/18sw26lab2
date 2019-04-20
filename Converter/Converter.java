/*convert from decimal to Binary
*/import java.util.*;
class Converter
{
public static void main(String[] args)
{ int answer=0; String hold="";
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value in Decimal");
	int num=sc.nextInt();
	while(num>0)
	{
		answer=num%2;
		hold=answer+" "+hold;
		num=num/2;

	}
	System.out.print("answer in binary:"+hold);

	 

	
}
}