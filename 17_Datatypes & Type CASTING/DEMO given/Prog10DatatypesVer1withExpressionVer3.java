class Prog10DatatypesVer1withExpressionVer3
{
	public static void main( String[] args)
    {
	  byte  a=1;
	  byte  b=2;
	  byte  d=3; // even Java treats 3 as int but internal automatic coversion
	        // above is OK
	  byte  c=a+b;  // while expression  a,b conveted to int type
	        // but above answer 3 is NOT OK
	  System.out.println(c);
	
	}

}