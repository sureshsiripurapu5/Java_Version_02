class Prog8DatatypesVer2
{
	public static void main( String[] args)
    {
		//byte b1 = 128;  // out of the range value 128 of int type (32 bits)
		//byte b2 = -129;
		
		
		byte b = (byte) 128;  // becomes valid now i.e., 127's  next value 
		byte B = (byte)-129;  // becomes valid now i.e., -128's next value
		System.out.println(b);
	    System.out.println(B);
	    // ABOVE is known as type casting by programmer
		 //byte d = (byte)true; // true is boolean type bcz incompatible  
           
         
    }

}