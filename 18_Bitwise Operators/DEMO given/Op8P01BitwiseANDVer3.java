class Op8P01BitwiseANDVer3
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
	
												//   ============
	System.out.println(a+" & "+b+" = "+(a&b));//     0000 1010   // -6
									          //   ============
                                              // weights->8421 (signbit 1*-8=-8)
   } 
}
