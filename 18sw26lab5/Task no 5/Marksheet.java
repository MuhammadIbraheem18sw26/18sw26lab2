/* Create Marksheet class having three subjects as variables, methods for calculating total marks, percentage, and grade. */

class Marksheet{
int dcld=0;
int laag=0;
int oop=0;
int totalMarks=300;


public int totalMarks(int a,int b int c){
dcld=a;
laag=b;
oop=c;

	return a+b+c;
}
public double percentage(int sum){
	this.sum=sum;
	return (sum/totalMarks)*100;

 
}

public static void main(String[] args){
	Marksheet mark=new Marksheet();
	mark.totalMarks(89,65,99);
	int sum=mark.totalMarks(89,65,99);
	double per=mark.percentage(sum);
	System.out.println("Total marks : "+sum);
	System.out.print("Percentage : "+ per);
	
	
}
}