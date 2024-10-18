class A
{
	 
	    void    storeFinal()
		        {
				 final float PI_VALUE=3.14f;
				  //PI_VALUE++;		
				  PI_VALUE=4.44f;
				}
	    void    showFinal()
		        {
				 System.out.println(PI_VALUE);
							
				}       
	  
}	  
	

class FINALP02AsFieldInClassVer10
{
	public static void main(String args[])
	{
	     A aObj=new A();
		   aObj.storeFinal();
		   aObj.showFinal();
	}
}