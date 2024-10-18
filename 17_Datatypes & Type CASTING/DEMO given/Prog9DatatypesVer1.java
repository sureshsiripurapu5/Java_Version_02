class Prog9DatatypesVer1
{
	public static void main( String[] args)
    {
	  //float d1=0.0; // by default literal of real number becomes double type
  // above is ERROR bcz 64 bit floating-point value of 0.0
  //  can not store in 32 bits of d1 variable
	
   
    //solution-1 : to this problem
	 double d3=0.0;
	 System.out.println(d3);
	
	//solution-2 : to this problem, type casting can be (but not recommended)
	 float d4=(float)0.0; 
	System.out.println(d4);
	
    //solution-3 : to this problem, append literal with F or float
     float d5=0.0F;
	 System.out.println(d5);
	 
	 //float d2=3.4E38; // valid range still ERROR bcz converted to double 
	 

    }

}