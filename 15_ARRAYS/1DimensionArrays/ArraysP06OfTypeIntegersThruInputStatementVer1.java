import  java.util.Scanner;       
class ArraysP06OfTypeIntegersThruInputStatementVer1
{
   public static void main(String[ ] args)
   {   
         int[ ] subMarks= new  int[3];
        Scanner scanObj = new Scanner(System.in); 
       
          for( int i=0 ; i< 3; i++)
             {
               System.out.print("input marks in Subject?");
               subMarks[i]=scanObj.nextInt();  //  its like scanf() in C
             }
         for( int i=0 ; i<=2 ; i++)
              System.out.println(subMarks[i] );             
    }
}   