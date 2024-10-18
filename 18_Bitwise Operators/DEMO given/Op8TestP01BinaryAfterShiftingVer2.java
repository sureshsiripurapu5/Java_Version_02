class Op8TestP01BinaryAfterShiftingVer2
{
    public static void main(String[] args) 
    {
	 System.out.println("Bin of 121 : "+Integer.toBinaryString(121));          // prints  "1111001"
	 System.out.println(" 121 >> 1  : "+Integer.toBinaryString(121>>1));       // prints  "111100"
	 System.out.println(" 121 >>> 1 : "+Integer.toBinaryString(121>>>1));      // prints  "111100"	
	 
	 System.out.println("\nBin of -121: "+Integer.toBinaryString(-121));	   // prints  "11111111111111111111111110000111"
	 System.out.println("-121 >> 1  : "+Integer.toBinaryString(-121>>1));      // prints  "11111111111111111111111111000011"
     System.out.println("-121 >>> 1 : "+Integer.toBinaryString(-121>>>1));     // prints  "1111111111111111111111111000011"
	}
}