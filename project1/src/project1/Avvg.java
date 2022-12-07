package project1;

public class Avvg {

	public static void main(String[] args)
	{
		int []arr1= {10,20,30,40,50};
		 
		int sum =0;
		int avg =0;
		for(int i=0;i<arr1.length; i++)
		{
			sum+=arr1[i];
		}
		avg = sum/arr1.length;
		System.out.println("Average of the Elements in the array ::"+avg);

	}

}
