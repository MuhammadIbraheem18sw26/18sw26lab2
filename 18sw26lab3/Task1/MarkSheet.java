/*
1. Develop a mark sheet application in java which fulfills the following
requirements:
 The program takes input from the user marks obtained in three
subjects; C++, Data Structures and Operating Systems.
 The program calculates the total marks obtained out of 300.
 Calculate the percentage.
 Display the grade secured according to the following:
o 90 > Grade: A
o Between 90 and 80 Grade: B
o Between 79 and 70 Grade: C
o Between 69 and 60 Grade: D
o Below 60 Grade: FAIL
*/
import java.util.*;
class Marksheet{
	public static void main(String[] args)
	{
		int totalmarks=300;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks of Operating System");
		int marks1=sc.nextInt();
		System.out.println("Enter Marks of C++");
		int marks2=sc.nextInt();
		System.out.println("Enter Marks of Data Structure");
		int marks3=sc.nextInt();
		int obtainmarks=marks1+marks2+marks3;
		System.out.println("Total Marks : "+totalmarks);
		System.out.println("Marks in Operating System : "+marks1);
		System.out.println("Marks in C++: "+marks2);
		System.out.println("Marks in Data Structure : "+marks3);
		System.out.println("Obtain Marks out of 300 : "+obtainmarks);
		
		float percentage=((obtainmarks*100f)/totalmarks);
		System.out.println("Percentage : "+ percentage);
		if(percentage>=90){System.out.println("Grade A");}
		  if(percentage<90 && percentage>80){System.out.println("Grade B");}
		  if(percentage<80 && percentage>70){System.out.println("Grade C");}
		if (percentage<70 && percentage>60){System.out.println("Grade D");}
		if(percentage<60){System.out.println("Sorry to say you are Fail");}
		
			
	}
}