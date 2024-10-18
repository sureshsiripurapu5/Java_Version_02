class Prog10DatatypesVer1withExpressionVer5
{
	public static void main( String[] args)
    {
	  byte  a=1;
	  byte  b=2;
	 	  //byte  c=a+b;  // to solve this problem use type cast
	  byte c=(byte)a+ (byte)b;   // problem is with + i.e., expression     
	  System.out.println(c);
	
	}

}