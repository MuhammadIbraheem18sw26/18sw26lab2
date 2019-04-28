/*4. Write a java program that calculates the sum of two 2-dimensional arrays(Matrix) and saves the result in the third 
array and prints the result along with the positions of each element. 
*/
class ArryMulti{
public static void main(String[] args)
{
	
int [][] arr={{1,2,3},{3,6,5},{1,5,7}};
int [][] arr1={{8,0,5},{4,2,5},{3,7,8}};
int [][] sum=new int[3][3];

System.out.print(" Sum Matrix  \n\n");
for(int i=0;i<arr.length;i++)
{
	for(int j=0;j<arr[i].length; j++){
		sum[i][j]=arr[i][j]+arr1[i][j];
		
		
		System.out.print(sum[i][j]+" ");

}
System.out.println();
}
}
}
