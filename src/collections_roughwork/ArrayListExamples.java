package collections_roughwork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListExamples {
	
	public static void main (String [] args)
	{
		ArrayList <String> arraylist = new ArrayList <String> ();
			
			arraylist.add("John");
			arraylist.add("Smith");
			arraylist.add("Romeo");
			arraylist.add("Juliet");
			arraylist.add("Alphanso");
			arraylist.add("Vijay");
			
			System.out.println(arraylist);
			
			for (String str: arraylist) 
			{
				System.out.println("You are Welcome : "+str);
				//    or
				System.out.println(str);
			}
			arraylist.remove("Alphanso"); // 
			arraylist.remove(3); 	// "3" indicates the index -- which is "Romeo"
			arraylist.remove("Juliet");
			
			System.out.println(arraylist);
			
			arraylist.add(2, "NewPerson");
			
			System.out.println(arraylist);
			
			//Using Iterator, it traverse through the elements of collection.
		/*Get an Iterator – 
		create an object for Iterator (iter) = set iterator() to traverse on arraylist*/
			Iterator iter = arraylist.iterator();
			while(iter.hasNext())
			{
				Object obj = iter.next();
				System.out.println(obj +" ");
			}
		/*Get Enumeration – 
		create an object for Enumeration(enumeration) = set Collection, 
		& to traverse, pass the  arraylist into Collections.enumeration(arraylist)*/
		/*using enumeration: -- as it is a part of Collections, the SyntaX is quite different.
			Collections.enumerations(pass the arraylist into enumeration)*/
			Enumeration enumeration = Collections.enumeration(arraylist);
			while (enumeration.hasMoreElements())
			{
				Object obj1 = enumeration.nextElement();
				System.out.println(obj1 +" ");
			}
			
			//declaring a vector
			/*constructor --- >  vect(int size, int incr){
			 the increment specifies the number of elements to 
			 allocate each time that a vector is resized upward*/
			
			Vector <Integer> vector = new Vector <Integer>(3, 2);
				vector.add(10);
				vector.add(20);
				System.out.println(vector.size());
				
			
			
		//	public class priorityQueue {
		//		public static void main (String [] args) {
				
				HashSet <Integer> hashSet = new HashSet <Integer>();
				
				hashSet.add(1);
				hashSet.add(1);
				hashSet.add(2);
				hashSet.add(3);
				hashSet.add(4);
				hashSet.add(5);
				
			/*Get an Iterator – 
			create an object for Iterator(iter1) = set iterator() to traverse on hashSet*/
				Iterator <Integer> iter1 = hashSet.iterator();
				
				while (iter1.hasNext())
				{
					int i = (Integer) iter1.next();
					System.out.println(i);
				}
				/* The above priorityQueue program adds numbers into the HashSet and prints it. we can observe that
				 "1" is entered twice. As Hashing removes duplicates, it prints "1" only once 
				  and removes the other "1"  */	
				
		//	public class priorityQueue {
		//		public static void main (String [] args) {
				
				TreeSet <String> treeSet = new TreeSet <String>();
				
				treeSet.add("Vijay");
				treeSet.add("Neelu");
				treeSet.add("Neelu");
				treeSet.add("Mata");
				treeSet.add("Durga");
				treeSet.add("Kalika");
				treeSet.add("Vaishno");
				
				System.out.println(treeSet);
			
				/* The above program adds "names", sorts them in alphabetical order and displays the names using
				 	TreeSet. We can observe that "Neelu" is added twice. when printed, "Neelu"
				 	will be displayed only once as the second entry is removed as duplicate-entry
				 	by TreeSet */
				
				// --- HashMap Insertion --- 
				//Create a HashMap
				
				HashMap hMap = new HashMap(); //RawType Declaration
		
				//by passing parameters <String, Integer> as declared below, the RawType warnings will go off	
		/*RawTypes are used, if we want to put or add multiple data types, if parameters are used, 
		then we should add or put only those datatypes(here in this case, String or Integer)*/	
		//HashMap <String, Double> hMap = new HashMap<String, Double>();
				
				//Put Elements
				hMap.put("Vijay", 3484.38);
				hMap.put("Neelu", 4950.69);
				hMap.put("Mata", 45940.98);
				hMap.put("Vaishno", 45494.90);
				hMap.put("kaalika", 45894.76);
				hMap.put("Durga", 45894.98);
			
			//   --- HashMap Display the Values ---
		/*Get an Iterator – 
		create an object for Iterator(iter2) = set iterator() to traverse on hMap.entrySet()*/
			Iterator iter2 = hMap.entrySet().iterator();
				//		or
			//Iterator<Entry<String, Double>> iter2 = hMap.entrySet().iterator();
			// Display elements	
				while (iter2.hasNext())
				{
					Map.Entry entry = (Map.Entry) iter2.next();
							
					System.out.println(entry.getKey()+ "  : " +entry.getValue());
				//	System.out.println(entry.getValue());
				}
				
		//	public class HashMapExampleProgram {
		//		public static void main (String [] args) {
				
				System.out.println("HashMap Program Start :");
				
			HashMap <Integer, String> hashMap = new HashMap <Integer, String>();
			
			hashMap.put(1, "Vaishno");
			hashMap.put(2, "Kaali");
			hashMap.put(3, "Mata");
			hashMap.put(4, "Durga");
			hashMap.put(5, "Vijay");
			hashMap.put(6, "Neelu");
			
			System.out.println(hashMap.size());
			System.out.println(hashMap.get(3)); // by using this get(), we can get only one value
		
			/* Now To get all the 'Values' with the corresponding 'Key', we shall use 
			"enhanced-for-loop" or "for-each loop" */
			
			for (Map.Entry<Integer, String> entry : hashMap.entrySet())
			{
				int key = entry.getKey();
				String value = entry.getValue();
				
				System.out.println(key+ " : " +value);
			}
			
			//public class HashtableProgram {
			//		public static void main (String [] args) {
					
				Hashtable hashtable = new Hashtable();
				
			// putting elements
				hashtable.put(1, "Vaishno");
				hashtable.put(2, "Kaali");
				hashtable.put(3, "Mata");
				hashtable.put(4, "Durga");
				hashtable.put(5, "Vijay");
				hashtable.put(6, "Neelu");
			
			//use enumeration: using enumeration, we are getting the "keys" of Hashtable
				Enumeration enumeration1 = hashtable.keys();
			
			//Display elements
				while (enumeration1.hasMoreElements()) 
				{
					int key = (int) enumeration1.nextElement();
					
					String value = (String) hashtable.get(key);
					System.out.println(key+" : "+value);
				}
		}
}
