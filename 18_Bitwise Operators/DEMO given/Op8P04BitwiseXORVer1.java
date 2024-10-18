class Op8P04BitwiseXORVer1
{
    public static void main(String args[]) 
    {
        int a=5;  //+ve                       //     0000 0101
	    int b=6;  //+ve                       //    ^0000 0110
// both bits are SAME resultant bit 0 otherwise 1  ============
	System.out.println(a+" ^ "+b+" = "+(a^b));//     0000 0011   // 3  
									          //   ============
                                              // weights->8421 (signbit 0*8=0)
   }
}
