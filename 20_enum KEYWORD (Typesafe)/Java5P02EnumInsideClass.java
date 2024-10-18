class Java5P02EnumInsideClass
{
  enum Season { WINTER, SPRING, SUMMER, FALL; }  //semicolon(;) is optional here
    public static void main(String[] args) 
    {
      Season s=Season.WINTER;//enum type is required to access WINTER
      System.out.println(s);
	  //Season s5=Season.RAINY; 
      //System.out.println(s5);
   }
}