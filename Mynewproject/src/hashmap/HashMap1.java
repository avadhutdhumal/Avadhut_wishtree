package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		hs.put(16, "pooja");
		hs.put(12, "ram");
		hs.put(18, "ramesh");
		hs.put(14,"kinjal");
		hs.put(14,"sonu");
		hs.put(14,"xyz");
		
		
		System.out.println(hs);
		System.out.println("=====key set=======");
	Set<Integer> st=	hs.keySet();
	
	Iterator<Integer> it=st.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
		
		
	}
	System.out.println("=====values=======");
	
	Collection col=hs.values();
    Iterator<String> it1=	col.iterator();
    while(it1.hasNext())
    {
	System.out.println(it1.next());
    }
	
	
    System.out.println("=====Entry set======");
       
    Set<Entry<Integer,String>> ent=hs.entrySet();
    
      Iterator<Entry<Integer,String >> it2= ent.iterator();
      System.out.println("Enter id");
      int id=sc.nextInt();
      while(it2.hasNext())
      {
    	Entry<Integer,String>  en= it2.next();
    	Integer a=en.getKey();
    /*	if(a>16)
    	{
    	System.out.println(en.getKey() +"  "+ en.getValue());
    	}*/
    String name=	en.getValue();
   /* if(name.equals("ram"))
    {
    	System.out.println(en.getKey() +"  "+ en.getValue());
    }*/
    
    if(id==a)
    {
    	System.out.println(en.getValue());
    }
    
    
      }
		
		
		
		
		

	}

}
