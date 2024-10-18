class Op8P01BitwiseANDVer2
{
    public static void main(String args[]) 
    {
        int a=-5;   //-ve BUT Actual bits of 5=>     0000 0101
							 // 1's complement=>     1111 1010
							 // 2's complement=>            +1
					//  NOW Finally bits of -5=>     1111 1011
		int b= 6;   //+ve                           &0000 0110
									          //   ============
	System.out.println(a+" & "+b+" = "+(a&b));//     0000 0010   // 2
									          //   ============
                                              // weights->8421 (signbit 0*8=0)
   } 
}
