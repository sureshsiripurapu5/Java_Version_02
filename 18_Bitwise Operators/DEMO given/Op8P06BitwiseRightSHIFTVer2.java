class Op8P06BitwiseRightSHIFTVer2
{
    public static void main(String args[]) 
    {
        int a=-20;   //-ve BUT Actual bits of 20=>     0001 0100
							   // 1's complement=>     1110 1011
							   // 2's complement=>            +1
					  // NOW Finally bits of -20=>     1110 1100 STORED INTERNALLY
	//right side 2 bits 00 are dropped space-- on RHS  --11 1011 //spaces filled by 00
		int n=2;  // no of bits to SHIFT Leftside									   
	System.out.println(a+" >> "+n+" = "+(a>>n) ); // 001  1 1011 // <-- -5 is answer
	                             // weights->signbit  32 16 8421     (1 * 32 = 32)
                                 // FORMULA for -5 is=> -20 / (2^2) = -5 
    }
}
