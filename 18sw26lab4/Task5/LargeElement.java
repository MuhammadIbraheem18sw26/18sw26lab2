/*5. Write a java program that find the largest element in the array*/
class LargeElement{
	public static void main(String[] args)
	{
		int large=0;
		int[] arr={1,15,30,76,0,44,17};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
			
				large=arr[i];
			}
		
			
		}
		System.out.println("Largest element of Arry :"+large);
	}
}