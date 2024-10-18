class Op8P04BitwiseXORVer2
{
    public static void main(String args[]) 
    {
        int a=-5;   //-ve BUT Actual bits of 5=>     0000 0101
							 // 1's complement=>     1111 1010
							 // 2's complement=>            +1
					//  NOW Finally bits of -5=>     1111 1011
		int b= 6;   //+ve                           ^0000 0110
// both bits are SAME resultant bit 0 otherwise 1  ============
	System.out.println(a+" ^ "+b+" = "+(a^b));//     0000 1101   // -3  
									          //   ============
                                              // weights->8421 (signbit 1*-8=-8)
   } 
}
