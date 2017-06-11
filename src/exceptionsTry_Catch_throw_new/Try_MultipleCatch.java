package exceptionsTry_Catch_throw_new;

public class Try_MultipleCatch {
	
	int number;
	int arrayname[] = new int[5]; // here the index is 0 to 4 only
	
	public Try_MultipleCatch(int number) // single parameterized constructor
	{
		try 
		{
			if (number == 0)
			{
				System.out.println(10/number);	
			}
			else
			{
				arrayname[5] = number; // here the index is 5, so if its more than 4, then it will be IndexOutOfBoundsException.
				System.out.println(arrayname);
			}
		}
		catch (ArithmeticException dividebyzeroexception)
		{
			System.out.println(dividebyzeroexception);
		}
		catch (ArrayIndexOutOfBoundsException arrayexception)
		{
			System.out.println(arrayexception);
		}
	}
}

/*public static void main(String[] args) {
	
	Try_MultipleCatch multiplecatch1 = new Try_MultipleCatch(0);
	
	Try_MultipleCatch multiplecatch2 = new Try_MultipleCatch(5);

}*/

