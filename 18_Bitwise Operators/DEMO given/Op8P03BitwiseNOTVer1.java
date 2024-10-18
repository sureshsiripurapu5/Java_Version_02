class Op8P03BitwiseNOTVer1
{
    public static void main(String args[]) 
    {
        int a=5;  //+ve                       //     0000 0101
	              //all 1s becomes 0s and vice-versa
	System.out.println(" ~ "+a+" = "+(~a));   //     0000 1010   // -6 [Formula -(5+1)]
									          //   ============
                                              // weights->8421 (signbit 1*-8=-8)
   }
}
