class ArraysP03DeclarationAndCreatingVer2
{
   public static void main(String[ ] args)
   { 
             
     // METHOD-1 - in 2 separate steps
        // step-1  : Just Declaration of ArrayTypeVariable(Ref)
            int[ ]  subjects ; 
		// prefer this BETTER to call as int array of subjects ref variable
  
    // now its our need to create memory space for obj/array 
        // step-2   : Allocaton of memory space 
            // new int[3];  // ERROR
            // linking properly as follows
	      
		    subjects=new int[3];
	
    }
}   