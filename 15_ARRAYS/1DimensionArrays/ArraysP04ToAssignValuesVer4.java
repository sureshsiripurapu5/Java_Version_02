class ArraysP04ToAssignValuesVer4
{
   public static void main( String args[ ] )
   {   
    int[ ] subjects = new int[ 3 ]; 
	 // SIZE can be integer LITERAL or VARIABLE (only in Java)   
        
        // ofcourse index can be LITERAL / VARIABLE / EXPRESSION
            
           subjects[ 0 ]     =   78; // index in the form of  LITERAL
           int x=1;
           subjects[ x ]     =   89; // index in the form of  VARIABLE 
           subjects[ 4 - 2 ]  = 100; // index in the form of  EXPRESSION
                          
      for (int  i=0;i<=2;  i++  )                                       // or ++i  // or i=i+1;  // or i+=1;
           System.out.println( subjects[ i ] ); 
   }
}     