import java.util.Scanner;
class SearchingPO1LinearSearchVer3
{
	public static void main(String[] args)
    {
		Scanner scObj=new Scanner(System.in);
		System.out.print("How many elements?");
	    int n=scObj.nextInt();
		int[] array=new int[n];
		System.out.println("Enter " + n + " Elements:-");
		for(int i=0 ,count=0;i<=n-1;i++,count++)
		{
	        System.out.print(count +" . ");
	        array[i]=scObj.nextInt();
		}
	    System.out.println("SEARCH FOR?");
	    int s=scObj.nextInt();
		  //LOGIC : LINEAR  SERACH
		  boolean found=false;
		for(int i=0;i<=n-1;i++)
		{
			if (s== array[i] ) 
			{   found=true;
				System.out.println("FOUND " + array[i] + " at INDEX : " +i);
			}
		}
		if(!found)
			System.out.println("Not FOUND");
	}
}	
