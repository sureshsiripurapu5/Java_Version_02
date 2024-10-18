class Op8P07BitwiseZEROFILLRightSHIFTVer1
{
    public static void main(String args[]) 
    {
        int a=20;  //+ve                               0001 0100
	//right side 2 bits 00 are dropped space-- on LHS  --00 0101 //spaces filled by 00
		int n=2;  // no of bits to SHIFT rightside									   
	System.out.println(a+" >> "+n+" = "+(a>>>n) ); //  0000 0101 // <-- 5 is answer
	                             // weights->signbit     16 8421     (0 * 16 = 0)
                                
    }
}
