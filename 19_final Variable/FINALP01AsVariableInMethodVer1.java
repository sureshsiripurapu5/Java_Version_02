class FINALP01AsVariableInMethodVer1
{
	public static void main(String args[])
	{
	 final	int a;   // allowed in methods only
	            a=1; // allowed in methods
		    
	 final int b;
	           b=2;
			   //System.out.println(++b);
	 final int c=3;
	           //c=4;
			   System.out.println(c++);
	}
}