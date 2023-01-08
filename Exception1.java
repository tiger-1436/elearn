class Exception1 
{
	public static void main(String[] args) 
	{
		try
		{  
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
           
		   int c=a/b;
		   System.out.println(c);

			
		}
		catch (ArrayIndexOutOfBoundsException aiob)
		{ System.out.println("please pass atleast two interger vslues");
		}
		catch (NumberFormatException nfe)
		{
           System.out.println("please pass only interger values");
		}
		catch (ArithmeticException ae)
		{
           System.out.println("please do not pass 2nd value ZERO");
		}
	}
}
