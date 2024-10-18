class ArraysP04ToAssignValuesVer3
{
   public static void main( String args[ ] )
   {   
        int[ ] subjects = new int[ 3 ];   
        
     // to store KNOWN DATA by programmer following is ONE SOLUTION     
           subjects[ 0 ] =  78  ;        
           subjects[ 1 ] =  89  ;          
           subjects[ 2 ] = 100  ;         
      // Java's Enhanced for Loop(known as forEach Loop)
      for (int var:subjects)                                         // or i+=1;
           System.out.println( var ); 
   }
}     