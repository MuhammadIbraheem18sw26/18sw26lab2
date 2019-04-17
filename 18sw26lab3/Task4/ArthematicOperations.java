/*4. Write a java program that performs arithmetic operations on two
numbers after taking 3 runtime arguments; 1st number, 2nd number
and the operators (+, -, /, *) and prints the result./*
*/
import java.util.*;
class ArthematicOperations
{
	public static void main(String[] args) 
	{
		int num1=0,num2=0;
		char operator;
		int answer=0;
		double c=0;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the First number ");
		num1=input.nextInt();
		System.out.println("Enter the Second Number");
		num2=input.nextInt();
		System.out.println(" Select Arthematic Operator From the Following operators \n'+'\n'-'\n'*'\n'/' ");
		operator=input.next().charAt(0);
		switch(operator){
			case '+': answer=num1+num2;
			break;
			
			case '-': answer=num1-num2;
			break;
			
			case '*': answer=num1*num2;
			break;
			
			case '/':
			
			  c=num1/num2;
			
			
			break;
			
			default :
			 System.out.println("You select Wrong Operator");
		}
		if(operator!='/')
		{
			System.out.println("Answer : "+answer);}
	else 
	{
		System.out.println("Answer : "+c);}
		
		
	}
}