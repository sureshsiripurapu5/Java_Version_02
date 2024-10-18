class CodeBlockVer2
{
    public static void main(String[] args)
    {
	
       int a=1;
         {   //outer block
           int b=2;
	         { //inner block
	           int c=3;
	                {  //innermost block
		           int d=4; // c=10;
		  	       System.out.printf("From innermost Block : block variable d=%d",d);
	                }
		//System.out.printf("From inner Block : block variable d=%d",d);			
	    System.out.printf("\nFrom inner Block : block variable c=%d",c);

	          }
       System.out.printf("\nFrom outer Block : block variable b=%d",b);

          }
System.out.println("\nFrom main() method : block variable a="+a);
    }
}	
