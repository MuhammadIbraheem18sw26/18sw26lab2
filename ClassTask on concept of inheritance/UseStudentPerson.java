public class UseStudentPerson{
public static void main(String args[]){
Student obj = new Student(); // sub class of Person
Graduate obj1=new Graduate(); // sub class of Student
Undergraduate obj2=new Undergraduate(); // sub class of Student
obj.setName("Fahad");  
obj.setNameOfSchool("government");  //
obj1.setNameOfDegree("Masters"); // sub class of Student method of class Graduate
obj1.setNameOfSchool("Private");  // sub class of Student method of class Student
obj2.setNameOfDepartment("Software department"); // sub class of Student method of class undergraduate
obj2.setNameOfSchool("Semi Government");

System.out.println("Name of Student :"+obj.getName());
System.out.println("Name of School :"+obj.getNameOfSchool());
System.out.println("Name of  Degree:"+obj1.getNameOfDegree());
System.out.println("Name of Student :"+obj1.getName());
System.out.println("Name of Department :"+obj2.getNameOfDepartment());
System.out.println("Name of Department :"+obj2.getNameOfSchool());
}
}