class Op8P04BitwiseXORVer3
{
    public static void main(String args[]) 
    {
        int a=-5;   //-ve BUT Actual bits of 5=>     0000 0101
							 // 1's complement=>     0000 1010
							 // 2's complement=>            +1
					//  NOW Finally bits of -5=>     0000 1011
		
		int b=-6;   //-ve BUT Actual bits of 6=>     0000 0110
							 // 1's complement=>     0000 1001
							 // 2's complement=>            +1
					//  NOW Finally bits of -6=>     0000 1010
	
// both bits are SAME resultant bit 0 otherwise 1  ============
	System.out.println(a+" ^ "+b+" = "+(a^b));//     0000 0001   // 1
									          //   ============
                                              // weights->8421 (signbit 0*8=0)
   } 
}
