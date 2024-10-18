class Prog8DatatypesTest2
{
	public static void main( String[] args)
    {
		short s1=  32767;   
		short s2= -32768; 
		System.out.println(s1);
	    System.out.println(s2);
		
		
		
		short s3= (short) 32768;
		System.out.println(s3);
		short s4= (short)-32769; 
		System.out.println(s4);
		
		short s5= (byte) 32768; 
         /*   above is NOT an ERROR bcz 32 bits of 32768 (int) 
              forced by programmer to convert into 8 bits(byte)
              to store in 16 bits variable (short)
              WHICH IS POSSIBLE
         */
	    System.out.println(s5);
		
		short s6= (short) 32768; // actual TYPE CASTING
		System.out.println(s6);
	        
    }

}