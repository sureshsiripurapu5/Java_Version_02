import java.util.Scanner;
class ArraysP01Dynamic1DVer2
{
	public static void main(String args[])
	{
        Scanner scObj=new Scanner(System.in);
		System.out.print ("How many integers u wish to store?");
		int n=scObj.nextInt();
		
		  // size of array depends on user's input
		  // Array is created dynamically(Runtime)
		int[] numArray=new int[n]; // allows variable as SIZE in Java 
		 
		System.out.println("Input "+n+" Integer numbers:-");
		for( int i=0; i<=n-1; i++)
			 numArray[i] =scObj.nextInt();
			
			
		System.out.println("Given integers:-");
        for(int value:numArray)
		   System.out.print(value+" ");
	    
	}
}
