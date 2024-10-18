// PRE-CONDITION : elements shoild be in dis-order
// to know max. performance : elements in descending order
import java.util.Scanner;
class SortingP01BubbleSortVer2 
{
	public static void main(String[] args)
    {
		Scanner scObj=new Scanner(System.in);
		System.out.print("How many elements?");
	    int n=scObj.nextInt(); // user decides the Number of elements
		int[] array=new int[n];
		System.out.println("Enter " + n + " Elements:-");
		for(int i=0;i<n ;i++ )
		{
	      System.out.print("element-" + (i+1)+ "?");
	      array[i]=scObj.nextInt();
		}
		//LOGIC : BUBBLE SORT  : ASCENDING ORDER
		   for( int pass=1;pass<n;pass++)
		 	  for( int index=0;index<n-pass;index++)
			    if (array[index] > array[index+1])  
			    { 
				  int temp= array[index];
				  array[index]=array[index+1];
				  array[index+1]=temp;
				} 
		System.out.println("Sorted ARRAY :-");
		for(int index=0;index<n;index++)
          System.out.print(array[index]+"  ");
	}
}	
