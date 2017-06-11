package collections_roughwork;

class Student
{
}
class Customer
{
}
class newInstanceExample {
	
	public static void main(String[] args) throws Exception {
		
		Object o = Class.forName(args[0]).newInstance();
		
		System.out.println("Object created for : "+ o.getClass().getName());
	
	}
	
	/*public void m1(int... x)
	{
		int [] y = new int[1000];
		int z[] = new int [5000];
	}*/
	
}

