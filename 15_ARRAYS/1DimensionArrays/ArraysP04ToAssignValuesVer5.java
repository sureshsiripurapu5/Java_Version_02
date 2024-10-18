class ArraysP04ToAssignValuesVer5
{
   public static void main( String args[ ] )
   {   
    // if programmer  use KNOWN DATA  following is INITIALIZATION METHOD
    //  int[] subjects = {78,89,100} ;  OR
	    int  subjects[] = {78,89,100} ; // exactly Like C/C++ BUT without SIZE
        // in this CASE Java counts values and chooses SIZE ( eg.3)    
                    // OR
        //NOTE : if u specify SIZE in above case ERROR in Java
         for (int  i=0;i<=2;  i++  )                                
              System.out.println( subjects[ i ] ); 
   }
}     