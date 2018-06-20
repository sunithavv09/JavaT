package Introduction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class CollectionArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// adding items into
		List<String>Als=new ArrayList<String>();
		Als.add("Java");
		Als.add("Phyton");
		Als.add("Ruby");
		Als.add("C#");
		Als.add(2, "pearl");
		Als.add("Java");
		
		System.out.println("value at  index 2 is "+Als.get(2));
		System.out.println("value of last index is "+Als.lastIndexOf(Als));
	//	Traversing through the list
		Iterator itr=Als.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Array list values "+itr.next());
		}
		
		ListIterator<String> ilt=Als.listIterator();
		
		while(ilt.hasNext())
		{
			System.out.println("forward traversing "+ilt.next());
		}
		
		while(ilt.hasPrevious())
		{
			System.out.println("backward traversing "+ilt.previous());
		}
		
 for(String str:Als )
   {
	   System.out.println("using for loop "+str );
   }


	Hashtable<String,Integer>hst=new Hashtable<String,Integer>();
	hst.put("one",1);
	hst.put("one",1);
	hst.put("two",2);
	hst.put("two",3);
	hst.put("five",5);
	hst.put("six",5);
	//hst.put(null,null);
	//hst.put(null,7);
	hst.put(null,8);
	//hst.put("seven",null);
	//hst.put("eight",null);
	for(Map.Entry m:hst.entrySet())
	{
		System.out.println("value is "+m.getValue()+" key is "+m.getKey());
		
	}





		
	}

}
