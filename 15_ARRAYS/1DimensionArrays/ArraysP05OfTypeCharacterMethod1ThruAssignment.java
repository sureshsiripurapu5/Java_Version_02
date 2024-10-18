class ArraysP05OfTypeCharacterMethod1ThruAssignment // for Known DATA  
{
   public static void main(String[ ] args)
   {   
      char[ ] vowels=new char[5]; // SIZE given because,NOT INITIALIZED
        // Thru ASSIGNMENT OPERATOR
            vowels[0] = 'a';   // char LITERAL in single quotes
            vowels[1] = 'e';
            vowels[2] = 'i';
            vowels[3] = 'o';
            vowels[4] = 'u';    //  Last index is SIZE-1

        for(int i=0; i < 5 ;i++)    
            System.out.print( vowels[i] + "\t" );
   }
}   