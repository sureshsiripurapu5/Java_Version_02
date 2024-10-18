class A
{
	      int   b;
	final int   A=1 ;
	final float PI_VALUE;  // NO DEFAULT VALUE BY CONSTRUCTOR
	            A()
		        {
				  PI_VALUE=3.14f;
				}
	            A(float pi)
		        {
				  PI_VALUE=pi;
				   System.out.println(PI_VALUE);
				   PI_VALUE++;
				}
	  
}	  
	

class FINALP02AsFieldInClassVer8
{
	public static void main(String args[])
	{
	     A aObj1=new A();
		 System.out.println(aObj1.PI_VALUE);  
		 
		 A aObj2=new A(4.44F);
		 //System.out.println(aObj2.PI_VALUE);
	}
}