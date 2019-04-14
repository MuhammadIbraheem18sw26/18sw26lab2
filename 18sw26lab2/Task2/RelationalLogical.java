/*2. Write java program to demonstrate the working of the following operators:
▪ Relational operators
▪ Logical Boolean operators
*/
class RelationalLogical{
public static void main(String[] args)
{
	// Relational Operators
	int a=27;
	int b=40;
	int c=50;
	int d=50;
	
System.out.print("Conditions of Relational Operaters \n where a=27\n b=40\n c=50\n d=50\n\n");
System.out.println("a is greater than b = "+(a>b));
System.out.println("b is greater than c ="+(b>c));
System.out.println("a is less than c = "+(a<c));
System.out.println("c is equal to d = "+(c==d));

System.out.println("\n\n");

	// Logical Boolean Operators
System.out.print(" Boolean logical Operators are \n| the OR operator\n");
System.out.println("& the AND operator");
System.out.println("^ the XOR operator");
System.out.println("! the NOT operator\n\n");

boolean A=true;
boolean B=false;

System.out.println("where A=true\nB=false\n\n");
System.out.println("& the AND operator between A and B = "+(A&B));
System.out.println("| the OR operator between A and B = "+(A|B));
System.out.println("^ the ZOR operator between A and B = "+(A^B));
System.out.println("! the NOT operator on B = "+(!B));

  }
	}