/* Create Marksheet class having three subjects as variables, methods for calculating total marks, percentage, and grade. */

class Marksheet{
int dcld=0;
int laag=0;
int oop=0;
static int sum1=0;
static double per=0.0;
static String grade="";
 int totalMarks=300;


public int totalMarks(int a,int b ,int c)
{
	int sum=a+b+c;
	this.sum=sum1;
dcld=a;
laag=b;
oop=c;

	return sum;
	
}
public double percentage(int sum)
{
	return (sum*100)/totalMarks;
}

public void grade(){
	if (per<=100 || per>=90){
		System.out.println("A1");
	}
	else if(per<90 || per>=80){
		System.out.println("A");
	}
	else if(per<80 || per>=70){
		System.out.println("B");
	}
	else if(per<70 || per>=60){
		
		System.out.println("C");
	}
	else{System.out.println("Fail");}
	
	public void showDetails(int sum,double per,String grade)
	{
		this.sum=sum;
		this.per=per;
		this.grade=grade;
		System.out.println("Obtain Marks "+sum);
		System.out.println("Percentage : "+per);
		System.out.println("Grade : "+grade);
		
		
	}
	
	
}

public static void main(String[] args){
	Marksheet mark=new Marksheet();
	Marksheet.sum=mark.totalMarks(89,65,99);
	Marksheet.per=mark.percentage(sum);
	Marksheet.grade=mark.grade(per);
	mark.showDetails();
	
	
	
	
}
}