class TwoDArraysP01DeclarationCreation
{
   public static void main(String[ ] args)
   { 
        // int   subArray[ ][ ];  // declaring 2D Array ref variable
                //OR
        int[ ][ ] matrixArrayRefVar ; // stores 'null' by default   
        matrixArrayRefVar  = new int[2][3];  // creates array object with 2 rows & 3 cols and links

    matrixArrayRefVar[0][1]=20;// 1st  row   2nd column-->our convention
    matrixArrayRefVar[1][2]=60;// 2nd row   3rd column-->our convention
   System.out.println(matrixArrayRefVar[0][1]+"\n"+matrixArrayRefVar[1][2]);
   }
}   