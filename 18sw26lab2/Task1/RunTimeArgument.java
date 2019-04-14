/*1. Write a java program to demonstrate the concept of java runtime arguments. Input your
name and roll number and print it on the console.
*/
class RunTimeArgument{
	public static void main(String[] args){
		String a,b;
		a=args[0];
		b=args[1];
		System.out.print("Name :"+a+"\n"+"Roll number : "+b);
	}	
}
