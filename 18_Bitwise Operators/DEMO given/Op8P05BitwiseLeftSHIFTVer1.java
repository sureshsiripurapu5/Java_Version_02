class Op8P05BitwiseLeftSHIFTVer1
{
    public static void main(String args[]) 
    {
        int a=5;  //+ve                              0000  0101
//left side 2 bits 00 are dropped space-- on RHS     0001  01-- //spaces filled by 00
		int n=4;  // no of bits to SHIFT Leftside									   
	System.out.println(a+" << "+n+" = "+(a<<n) ); // 0001  0100 // <-- 20 is answer
	                             // weights->signbit    16 8421     (1 * 16 = 16)
                                 // FORMULA for 5 is=> 5 * (2^2) = 20 
   }
}
