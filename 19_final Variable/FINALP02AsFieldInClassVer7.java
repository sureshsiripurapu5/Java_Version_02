class A
{
	      int   b;
	final int   A=1 ;
	final float PI_VALUE;  // NO DEFAULT VALUE BY CONSTRUCTOR
	            A()
		        {
				  PI_VALUE=3.14f;
				  System.out.println(PI_VALUE);
			    }
	
	  
}	  
	

class FINALP02AsFieldInClassVer7
{
	public static void main(String args[])
	{
	     A aObj=new A();
		 //System.out.println(A.PI_VALUE);
		 System.out.println(aObj.PI_VALUE);  
	}
}