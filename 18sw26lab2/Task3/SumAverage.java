/*3.Write java program that Declares 5 floating numbers and print their total sum and
average.
*/
class SumAverage{
	public static void main(String[] args){
	
	float val1=12.2f,val2=15.34f,val3=67.90f,val4=45.32f,val5=31.12f;
	float sum=val1+val2+val3+val4+val5;
	float average=sum/5;
	
	System.out.print("Floatong nummbers are" +", "+val1+", "+val2+", "+val3+", "+val4+", "+val5 +"\n");
	System.out.println("Sum of Floating Numbers :	"+sum );
	System.out.println("Average of Floating Numbers : "+average);
	}
}