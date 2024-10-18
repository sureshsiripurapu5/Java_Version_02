class Op8P02BitwiseORVer1
{
    public static void main(String args[]) 
    {
        int a=5;  //+ve                       //     0000 0101
	    int b=6;  //+ve                       //    |0000 0110
									          //   ============
	System.out.println(a+" | "+b+" = "+(a|b));//     0000 0111   // 4
									          //   ============
                                              // weights->8421 (signbit 0*8=0)
   }
}
