import java.util.Scanner;  
class ArraysP05OfTypeCharacterMethod3ThruInputStatementVer1 // for UnKnown Data  
{
      /*    if DATA to be stored in an ARRAY is UNKNOWN get it thru User 
            -with help of INPUT statement 
            BUT Java has NO built-in INPUT STATEMENT
      */
   public static void main(String[ ] args)
   {   
        char[ ] alphabet=new char[3];
        Scanner keyboard=new Scanner(System.in);//System.in->refers KEYBOARD
          for( int i=0 ; i< 3 ; i++)
             {
               System.out.print("Enter an Alphabet?");
               alphabet[i]=keyboard.nextChar();
             }
   
          for( int i=0 ; i<=4 ; i++)
              System.out.println(alphabet[ i ] ); 
   }
}   