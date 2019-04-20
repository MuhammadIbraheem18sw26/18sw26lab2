/*convert binary to decimal
*/import java.util.*;
import java.lang.Math;
class Converter2{
public static void main(String[] args)
{ Scanner sc= new Scanner(System.in) ;
System.out.print("Enter the no of Digits :");
int digits=sc.nextInt();
int arr[]= new int[digits];
System.out.println("Enter Binary numbers:");
for(int i=0;i<arr.length;i++)
{	
arr[i]=sc.nextInt();
}
int power=0;
int n=0;
for(int i=arr.length-1;i>=0;i--)
{
	
	n+=(arr[i]*Math.pow(2,power));
	power++;
	
}
System.out.println("Answer is :" +n);

}
}
