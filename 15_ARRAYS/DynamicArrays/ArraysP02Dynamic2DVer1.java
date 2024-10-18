import java.util.Scanner;
class ArraysP02Dynamic2DVer1
{
	public static void main(String args[])
	{
        Scanner scObj=new Scanner(System.in);
		System.out.print("How many Rows u wish to create?");
		int nr=scObj.nextInt();
		System.out.print("How many Columns u wish to create?");
		int nc=scObj.nextInt();
		
		int[][] A=new int[nr][nc];
		
		System.out.println("Enter "+ nr*nc +" elements:-");
        for( int r=0; r<=nr-1; r++)
		   for( int c=0; c<=nc-1;c++)
			  A[r][c] =scObj.nextInt();
			
		System.out.println("Entered "+ nr*nc +" elements for Matrix:-");
        for( int r=0; r<nr; r++) 
		{
			for( int c=0; c<nc;c++)
			  System.out.print(A[r][c]+"  ");
		  
		    System.out.println();
		}	
	    
	}
}
