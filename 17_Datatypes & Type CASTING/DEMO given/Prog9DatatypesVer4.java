class Prog9DatatypesVer4
{
	public static void main( String[] args)
    {
	  double f1=3.4E39;  // valid range but LHS is double 
      System.out.println(f1);
	  double f2=-3.4E39; // valid range but LHS is double 
      System.out.println(f2);
	
	
	  double f3=(float)3.4E39; // valid range still ERROR bcz converted to double 
      System.out.println(f3);
	  float f4=(float)-3.4E39F; // valid range still ERROR bcz converted to double 
      System.out.println(f4);
	
	}

}