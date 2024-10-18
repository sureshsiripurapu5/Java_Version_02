class Op8TestP01BinaryAfterShiftingVer1
{
    public static void main(String[] args) 
    {
		System.out.println("Bin of 1  : "+Integer.toBinaryString(1));          // prints  "1" 
	    System.out.println(" 1 >> 16  : "+Integer.toBinaryString(1>>16));      // prints  "0"
	    System.out.println(" 1 >>> 16 : "+Integer.toBinaryString(1>>>16));     // prints  "0"
										
		System.out.println("\nBin of -1 : "+Integer.toBinaryString(-1));	   // prints  "11111111111111111111111111111111"
		System.out.println("-1 >> 16  : "+Integer.toBinaryString(-1>>16));     // prints  "11111111111111111111111111111111"
		System.out.println("-1 >>> 16 : "+Integer.toBinaryString(-1>>>16));    // prints  "1111111111111111"
	}
}