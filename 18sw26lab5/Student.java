/*4. Create a Student class that stores student data, provides methods for initializing and displaying student 
data. Also provide a parameterized constructor for initializing student class data members. */
class Student{
	String name;
	String dpt;
	int age=0;
Student(String a,String b,int c)
{
	name=a;
	dpt=b;
	age=c;
 }
 void showDetails(){
	 System.out.println("Name : "+name+"\n"+"Department :  "+dpt+"\n"+"Age : "+age);
 }

	public static void main(String[] args)
	{
		Student use=new Student("Ibrahim","Software",19);
		use.showDetails();	
		}
}