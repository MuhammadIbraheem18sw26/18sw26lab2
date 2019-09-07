/*3. Develop a java class called Dog having three data members; name, breed and age. 
Create a function setDetails() which initializes these data members after taking parameters.
 Create another function showDetails() which print 
these values if these values are initialized otherwise show a message that details are unavailable. */
class Dog{
String name="",breed="";
int age=0;
 void setDetails(String name,String breed,int age)
 {
	this.name=name;
	this.breed=breed;
	this.age=age;
 } 	
 void showDetails(){
	 
	
	if (this.name==null && this.breed==null && this.age==0){System.out.println("detail are unavilable" );}
else {System.out.println(name+" "+breed+" "+" "+age);}
 }


	public static void main(String[] args)
	{
		String a=null;
		String b=null;
		int c=0;
		Dog dog = new Dog();
		dog.setDetails(a,b,c);
		dog.showDetails();
	}
	
}