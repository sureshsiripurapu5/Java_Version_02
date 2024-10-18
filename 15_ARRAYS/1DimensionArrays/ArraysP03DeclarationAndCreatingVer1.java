class ArraysP03DeclarationAndCreatingVer1 
{
   public static void main(String[ ] args)
   { 
             
     // METHOD-1
        // step-1  : Just Declaration of ArrayTypeVariable(Ref)
            int[ ]  subjects ; 
		// prefer this BETTER to call as int array of subjects ref variable
  
    // now its our need to create memory space for obj/array 
        // step-2   : Allocaton of memory space 
            new int[3];  
    // now 3 Locations are Ready but ref is not caught ...
	// so useless Also an ERROR
    }
}   