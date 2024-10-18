class A
{
	      int   b;
	final int   A=1 ;
	final float PI_VALUE;  // NO DEFAULT VALUE BY CONSTRUCTOR
	      void  update()
		        {
				  //A=A+1;
				  System.out.println(PI_VALUE);
			    }
	
	  
}	  
	

class FINALP02AsFieldInClassVer3
{
	public static void main(String args[])
	{
	     A aObj=new A();
		   aObj.update();
	}
}