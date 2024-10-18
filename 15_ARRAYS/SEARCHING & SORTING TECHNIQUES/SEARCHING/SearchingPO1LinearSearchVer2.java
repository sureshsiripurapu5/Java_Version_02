import java.util.Scanner;
class SearchingPO1LinearSearchVer2
{
	public static void main(String[] args)
    {
		Scanner scObj=new Scanner(System.in);
		System.out.print("How many elements?");
	    int n=scObj.nextInt();
		int[] array=new int[n];
		System.out.println("Enter " + n + " Elements:-");
		for(int i=0;i<=n-1;i++)
	      array[i]=scObj.nextInt();
	    System.out.println("SEARCH FOR?");
	    int s=scObj.nextInt();
		    //LOGIC : LINEAR  SERACH
	  for(int i=0;i<=n-1;i++)
	      if ( s == array[i] ) 
		  { 
	          System.out.println("FOUND " + array[i] + " at INDEX : " +i);
		      return;
		  }	
	    System.out.println("NOT FOUND " );        			  
	}
}	
