class ArraysP01TwoDVariableSizedVer1
{
	public static void main(String args[])
	{
       int  A[][]=new int[3][]; // no colums specified HERE
	        // only specify COLUMNS in each ROW
	          A[0]=new int[1];  
              A[1]=new int[3];	   
	          A[2]=new int[2];
            A[0][0]=10;
		    A[1][0]=20;
            //A[1][1]=30;
	        A[1][2]=40;
	        A[2][0]=50;
	        A[2][1]=60;
		  System.out.println(A[0][0]);
	      System.out.println(A[1][0]+"  "+A[1][1]+"  "+A[1][2]);
	      System.out.println(A[2][0]+"  "+A[2][1]);
	}
}
