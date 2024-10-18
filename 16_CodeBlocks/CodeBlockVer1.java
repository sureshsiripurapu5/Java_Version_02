class CodeBlockVer1
{
    public static void main(String[] args)
    {
	
       int a=2;
         {   //outer block
           int a=3;
	         { //inner block
	           int a=4;
	                {  //innermost block
		           int a=5;
		  	       System.out.printf("From innermost Block : block variable a=%d",a);
	                }
	    System.out.printf("From inner Block : block variable a=%d",a);

	          }
       System.out.printf("From outer Block : block variable a=%d",a);

          }
System.out.println("From outer Block : block variable a="+a);
    }
}	
