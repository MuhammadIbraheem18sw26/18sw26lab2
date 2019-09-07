/*1. Use Scanner class and its functions for taking inputs. */
import java.util.*;
class ScannerFunctions{
	public static void main(String[] args){
		int numint=0;
		float numfloat=0.0f;
		String name="";
		char section;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year  : ");
		numint=input.nextInt();
		System.out.println("Enter your pervious GPA : ");
		numfloat=input.nextFloat();
		System.out.println("Enter your Name : ");
		name=input.next();
		System.out.println("Enter Section : ");
		section= input.next().charAt(0);
	System.out.println("\n\n\n");
		System.out.println("Enter year  : "+numint);
		System.out.println("Enter your pervious GPA : "+numfloat);
		System.out.println("Enter your Name : "+name);
		System.out.println("Enter Section : "+section);
	}
}