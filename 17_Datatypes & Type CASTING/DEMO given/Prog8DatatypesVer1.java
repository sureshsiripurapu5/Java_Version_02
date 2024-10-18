class Prog8DatatypesVer1
{
	public static void main( String[] args)
    {   
	   // b1 is of 8 bits, has 8 locations in RAM
		  byte b1 = -128; // int type -128 (32 bits)
   // automatic internal type conversion takes place bcz within the range
		  byte b2  =  127;
		  byte b3=0;
		  //byte b4=128;
		
	    System.out.println(b1);
        System.out.println(b2);
		System.out.println(b3);
         
    }

}