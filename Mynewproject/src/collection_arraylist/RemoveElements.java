package collection_arraylist;

import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("sun");
		al.add("mon");
		al.add("tue");
		al.add("wed");                           //null //null
		al.add("sun");//{"sun","mon","tue","wed","sun","mon"}al[i]//arr[i]!=0
		al.add("mon");
		
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++)
			{
				String one=al.get(i);
				String two=al.get(j);
				if(one.equals(two) && !(al.get(j).equals("null")))
				{
					al.set(j, "null");
				}
			}
				if(!(al.get(i).equals("null")))
				{
					System.out.println(al.get(i));
				}
			}
	}

}
