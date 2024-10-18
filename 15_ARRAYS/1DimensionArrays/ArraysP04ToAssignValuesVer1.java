class ArraysP04ToAssignValuesVer1
{
   public static void main( String args[ ] )
   {   
        int[ ] subjects=new int[3];  // imagine 3 locations with ONE name
              
     // NOTE :    C/C++/Java identifies those locations with indexes 
     //starting from 0 to SIZE-1 as Last index

    subjects[ 0 ] =  78  ;  // FIRST subject Marks in FIRST index 0 (NOT 1)
    subjects[ 1 ] =  89  ;  // SECOND subject Marks in SECOND index 1 
    subjects[ 2 ] = 100  ;  // THIRD index is 2  (last index)
        
    System.out.println(subjects[ 0 ]);
	System.out.println(subjects[ 1 ]);
	System.out.println(subjects[ 2 ]);
   }
}     