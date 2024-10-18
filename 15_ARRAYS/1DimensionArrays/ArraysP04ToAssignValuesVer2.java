class ArraysP04ToAssignValuesVer2
{
   public static void main( String args[ ] )
   {   
        int[ ] subjects = new int[ 3 ];   
        
     // to store KNOWN DATA by programmer following is ONE SOLUTION     
           subjects[ 0 ] =  78  ;        // FIRST subject Marks in FIRST index 0 (NOT 1)
           subjects[ 1 ] =  89  ;        // SECOND subject Marks in SECONDE index 1 
           subjects[ 2 ] = 100  ;        // THIRD index is 2  (last index)
      // Traditional for Loop of Java
      for (int  i=0; i<=2;  i++  )                                       // or ++i  // or i=i+1;  // or i+=1;
           System.out.println( subjects[ i ] ); 
   }
}     