class TwoDArraysP03AssignmentVer2AsInitialization  
{
   public static void main(String[] args)
   {   
 // int matrixA[2][3]={{10,20,30},{40,50,60}};// invalid in Java with SIZE 
      
    int matrixA[][]={ {10,20,30},{40,50,60} }; // In Java SIZE must NOT be specified       
                            // OR           
        //int[ ][ ]   matrixA={{10,20,30},{40,50,60}};  // In Java SIZE must NOT be specified 
            for( int r=0 ; r<=1; r++)
            {
                for( int c=0 ; c<=2 ; c++)
				   System.out.print(matrixA[r][c] + "\t" );
				
                System.out.println();
            }

   }
}   