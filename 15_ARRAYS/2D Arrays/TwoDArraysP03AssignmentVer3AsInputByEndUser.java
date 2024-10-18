import  java.util.Scanner;   // to create user-defined input statement
class TwoDArraysP03AssignmentVer3AsInputByEndUser  
{
   public static void main(String[ ] args)
   {   
        int[ ] subMarks=new int[5];
        Scanner inputObj=new Scanner(System.in); // System.out -->refers KEYBOARD
          for( int i=0 ; i< 5 ; i++)
                {
                   System.out.print("input marks in Subject?");
                    subMarks[i]=inputObj.nextInt();
               }
   
          for( int i=0 ; i<=4 ; i++)
              System.out.println(subMarks[ i ] );              // System.out -->refers MONITOR
   }
}   