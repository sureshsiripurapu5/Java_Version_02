class Op8P05BitwiseLeftSHIFTVer2
{
    public static void main(String args[]) 
    {
        int a=-5;   //-ve BUT Actual bits of 5=>     0000 0101
							 // 1's complement=>     0000 1010
							 // 2's complement=>            +1
					//  NOW Finally bits of -5=>     0000 1011 STORED INTERNALLY
	//left side 2 bits 00 are dropped space-- on RHS 0010 11-- //spaces filled by 00
		int n=2;  // no of bits to SHIFT Leftside									   
	System.out.println(a+" << "+n+" = "+(a<<n) ); // 001  0 1100 // <-- -20 is answer
	                             // weights->signbit  32 16 8421     (1 * -32 = -32)
                                 // FORMULA for -5 is=> -5 * (2^2) = -20 
    }
}
