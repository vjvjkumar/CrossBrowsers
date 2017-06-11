package collections_roughwork;

public class String_StringBufferExample {
	/*transient int x;
	volatile String name;*/
	
	public static void main(String[] args) {
		
		//Differences between String and StringBuffer
		String str = new String("Durga");
		str.concat("Tech");			//immutable behaviour -- non changeable
		System.out.println(str);   //output: Durga
				
		StringBuffer strBuffer = new StringBuffer("Durga");
		strBuffer.append(" Tech");	// mutable behaviour -- changeable
		System.out.println(strBuffer); // output: Durga Tech
	//------------------------------------------------------------------------//			
		//Difference between "== operator" and "equals() method" in java?
		String s1 = new String("durga");
		String s2 = new String("durga");
		
		System.out.println(s1==s2); //output is: false  --- "== operator" 2 different objects reference(addressing) comparison
		System.out.println(s1.equals(s2)); // output is: true --- ".equals() " object's content comparison
	//------------------------------------------------------------------------//
		//Differences between StringBuffer and StringBuilder
		
				
	}
}	

