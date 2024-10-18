class Prog9DatatypesVer2
{
	public static void main( String[] args)
    {
	  float f1=3.4E38F; // valid range still ERROR bcz converted to double 
      System.out.println(f1);
	  float f2=-3.4E38F; // valid range still ERROR bcz converted to double 
      System.out.println(f2);
	
	
	  float f3=3.4E39F; // valid range still ERROR bcz converted to double 
      System.out.println(f3);
	  float f4=-3.4E39F; // valid range still ERROR bcz converted to double 
      System.out.println(f4);
	
	}

}