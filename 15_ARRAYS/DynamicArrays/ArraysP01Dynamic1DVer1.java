import java.util.Scanner;
class ArraysP01Dynamic1DVer1
{
	public static void main(String args[])
	{
		int[] numArray=new int[10];
		
		
		
        Scanner scObj=new Scanner(System.in);
		System.out.print ("How many integers u wish to store(1-10)?");
		int n=scObj.nextInt();
			 
		System.out.println("Input "+ n +" Integer numbers:-");
		for( int i=0; i<=n-1; i++)
			 numArray[i] =scObj.nextInt();
					
		System.out.println("Given integers:-");
        for(int variable:numArray) 
		   System.out.print(variable+" ");
	          // empty locations are filled with ZEROs
	}
}
