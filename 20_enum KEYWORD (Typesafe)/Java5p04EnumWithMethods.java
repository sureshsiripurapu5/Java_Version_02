class Java5p04EnumWithMethods
{
    enum Season { WINTER, SPRING, SUMMER, FALL }

    public static void main(String[] args) 
    {
      for(Season s : Season.values()) // using for-EACH Loop
          System.out.println(s);
	  System.out.println("Value of WINTER is: "+Season.valueOf("WINTER"));  
      System.out.println("Index of WINTER is: "+Season.valueOf("WINTER").ordinal());    

    }
}     //SCROLL DOWN










/*

Here we used values(),valueOf and ordinal() methods with enum type Name

*/