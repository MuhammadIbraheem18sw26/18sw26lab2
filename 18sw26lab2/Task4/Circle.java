/*4. Write java code that define radius for a circle and print the circumference, diameter and
area for the circle.
*/
class Circle{
	public static void main(String[] agrs)
	{
		int radius=3;
		float diameter=2*radius;
		double circumference=(2*3.141)*radius;
		double area=(radius*radius)*3.141;
		System.out.println("Radius of Circle is = "+radius+" meters");
		System.out.println("Diameter of Circle = "+diameter+ " meters");
		System.out.println("Circumference of Circle = "+circumference+" meters");
		System.out.println("Area of Circle = "+area+" metersquare");
	}
}