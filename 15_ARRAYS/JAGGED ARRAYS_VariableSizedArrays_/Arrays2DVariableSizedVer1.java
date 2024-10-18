class Arrays2DVariableSizedVer1 
{
	public static void main(String args[])
	{
       int[][] A=new int[3][];  // specified only 3 ROWs
	           A[0]=new int[2];   //1st ROW 2 COLs
               A[1]=new int[1];	  //1st ROW 1 COL 
	           A[2]=new int[4];   //1st ROW 4 COLs
  	System.out.println(A[0][0]+" "+A[0][1]);
	System.out.println(A[1][0]);
	System.out.println(A[2][0]+" "+A[2][1]+" "+A[2][2]+" "+A[2][3]);
	}
}
