// PRE-CONDITION : elements shoild be in dis-order
// to know max. performance : elements in descending order
import java.util.Scanner;
class SortingP02SelectionSortVer1
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
		//LOGIC : SELECTION SORT  : ASCENDING ORDER
		int alind=0,flind=0;  
		    for( int pass=0;pass<=n;pass++)
		    {	for( int index=pass;index<n;index++)
			    {
				    alind=flind=index;  
			        if (array[flind] > array[index])  
			               flind=index;     
				}  
				if (alind != flind)
				{					
				  int temp= array[alind];
				  array[alind]=array[flind];
				  array[flind]=temp;
				} 
	        }		
		System.out.println("Sorted ARRAY :-");
		for(int index=0;index<n;index++)
          System.out.print(array[index]+"  ");
	}
}	
