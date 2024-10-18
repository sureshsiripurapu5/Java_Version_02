class Op8P03BitwiseNOTVer2
{
    public static void main(String args[]) 
    {
        int a=-5;   //-ve BUT Actual bits of 5=>     0000 0101
							 // 1's complement=>     0000 1010
							 // 2's complement=>            +1
					//  NOW Finally bits of -5=>     0000 1011
	                //all 1s becomes 0s and vice-versa
	System.out.println(" ~ "+a+" = "+(~a));   //     0000 0100   // +4 [Formula -(-5+1)]
									          //   ============
                                              // weights->8421 (signbit 0*8=0)
   } 
}
