package project1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World....");
		
//        //declare and memory allocation
//		int []arr1=new int[5];
//		
//		//initialization
//		arr1[0]=10;
//		arr1[1]=20;
//		arr1[2]=30;
//		arr1[3]=40;
//		arr1[4]=50;
		
		//int []arr1= {10,20,30,40,50};
		
		 int [][]arr2=new int[3][2];
		 
		 arr2[0][0]=10;
		 arr2[0][1]=20;
		 arr2[0][2]=30;
		 
		 arr2[1][0]=40;
		 arr2[1][1]=50;
		 arr2[1][2]=60;
		 
		 arr2[2][0]=70;
		 arr2[2][1]=80;
		 arr2[2][2]=90; 
		 
	for(int i=0;i<arr2.length; i++)
		for(int j=0;j<arr2.length; j++)
		{
			System.out.println(arr2[i][j]);
		}
		
//	int [][] arr2= {  {10,20,30},
////{40,50},
////{70,80,90,40,50}
////};
////System.out.println("Length of Array:"+arr2.length);
////System.out.println("Length of First row:"+arr2[0].length);
////System.out.println("Length of Second row :"+arr2[1].length);
////System.out.println("Length of third row:"+arr2[2].length);	
		
	}
}


