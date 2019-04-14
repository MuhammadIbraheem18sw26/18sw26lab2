/*5. Write java program to demonstrate the working of the Bitwise operators
*/
class Bitwise{
	public static void main(String[] args){
		int a=2;
		int b=~a;
		int c=3;
		System.out.println("where a=2 and c=3");
		System.out.println("Compliment ~ of a "+b);
		System.out.println("Bitwise AND & Between A and C = "+(a&b));
		System.out.println("Bitwise OR | Between A and C ="+(a|b));
		System.out.println("Bitwise left shift << A = "+(a<<2));
		System.out.println("Bitwise right shift >> C =  "+(c>>2));
	}
}