import java.util.Scanner;
class SearchingP02BinearSearchVer1
{
	public static void main(String[] args)
    {
		Scanner scObj=new Scanner(System.in);
		System.out.print("How many elements?");
	    int n=scObj.nextInt();
		int[] array=new int[n];
		System.out.println("Enter " + n + " Elements IN Ascending order PLEASE:-");
		for(int i=0;i<n ;i++ )
		{
	        System.out.print("element-" + (i+1)+ "?");
	        array[i]=scObj.nextInt();
		}
	    System.out.println("SEARCH FOR?");
	    int s=scObj.nextInt();
		  //LOGIC : BINARY  SERACH
		int l=0,h=n-1,mid; 
			do
			{
		      mid=(l+h)/2;
			  if(s==array[mid])
			  {
				System.out.println("FOUND at INDEX : " +mid);
                return;
			  }
                 else
				   if(s>array[mid])
					l=mid+1;
                    else 
                       if(s<array[mid])
                        h=mid-1;						   
			}
			while(l<=h);
		System.out.println("NOT FOUND");
	}
}	
