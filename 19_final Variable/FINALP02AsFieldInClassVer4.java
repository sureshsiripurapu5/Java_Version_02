class A
{
	      int   b;
	final int   A=1 ;
	final float PI_VALUE;  // NO DEFAULT VALUE BY defaultCONSTRUCTOR of Java
	            A(float pi)
		        {
				
				 PI_VALUE=pi;
				  System.out.println(PI_VALUE);
			    }
	
	  
}	  
	

class FINALP02AsFieldInClassVer4
{
	public static void main(String args[])
	{
	     A aObj=new A(3.14F);
		  
	}
}