/*q3)Write a program to create a hashmap as follows. A hashmap ‘oldMap’
has multiple duplicate values. Write a program to create new hashmap
‘newMap’ which contains keys as unique values of ‘oldMap’ and values as
count of number of times value has appeared in ‘map’.
e.g. oldMap = (1, ‘a’) , (2,’b’), (3,’c’), (4,’b’), (5,’a’), (6,’a’)
newMap = {‘a’,3) , (‘b’,2),(‘c’,1)*/
package assignment_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OldMap {
	public static void main(String[] args) {
		HashMap<Integer, String> old = new HashMap<Integer, String>();
		old.put(1, "a");
		old.put(2, "b");
		old.put(3, "c");
		old.put(4, "b");
		old.put(5, "a");
		old.put(6, "a");

		System.out.println("-------Old Hashmap--------");
		System.out.println(old);

		HashMap <String,Integer> newh = new HashMap<String,Integer>();
//		Set<Entry<Integer, String>> ss=old.entrySet();
		
		Iterator <Entry<Integer, String>> it = old.entrySet().iterator();
//		System.out.println("------key-value Pair--------");
		while (it.hasNext())
		{
			Map.Entry pair = (Map.Entry) it.next();

//			System.out.println(pair.getKey() + " = " + pair.getValue());

			if (newh.containsKey(pair.getValue())) 
			{
				newh.put((String) pair.getValue(), Integer.parseInt(newh.get(pair.getValue()).toString()) + 1);
			} else {
				newh.put((String) pair.getValue(), 1);
			}
			it.remove();

		}
		System.out.println("\nDuplicate Count");
		System.out.println(newh);
	}

}
