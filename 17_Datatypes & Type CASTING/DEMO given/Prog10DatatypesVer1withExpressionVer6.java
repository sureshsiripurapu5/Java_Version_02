class Prog10DatatypesVer1withExpressionVer6
{
	public static void main( String[] args)
    {
	  byte  a=1;
	  byte  b=2;
	 	  //byte  c=a+b;  // to solve this problem use type cast
	  byte c=(byte)(a+b);   
// first result 3 converted to int which must be finally need to type cast     
	  System.out.println(c);
	
	}

}