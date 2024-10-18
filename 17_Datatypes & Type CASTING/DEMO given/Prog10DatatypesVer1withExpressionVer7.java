class Prog10DatatypesVer1withExpressionVer7
{
	public static void main( String[] args)
    {
	  short  a=1;
	  short  b=2;
	  //short d=3;  // OK	   
	 // short  c=a+b;  // 3 becomes int type SO not OK in Java with expression 
 // first result 3 converted to int which must be finally need to type cast     
	  //short e=(short) a+b; // again error
	  short e=(short) (a+b); 
	  System.out.println(e);
	
	}

}