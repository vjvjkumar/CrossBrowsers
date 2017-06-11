package exceptionsTry_Catch_throw_new;

public class Throw_Student {
	
	public Throw_Student(int studentid, String studentname)  // parameterized consructor
	{
		try{
			if (studentid == 0)
			{
				throw new Exception("id cannot be zero");
			}
			else
			{
				System.out.println("The id of " + studentname + " is " +studentid);
			}
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main (String [] args){
		
		Throw_Student student1 = new Throw_Student(0, "vijay");
		Throw_Student student2 = new Throw_Student(12,"neelu");
	}
}
