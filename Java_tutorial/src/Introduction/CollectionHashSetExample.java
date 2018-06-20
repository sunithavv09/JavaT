package Introduction;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String>HSE=new HashSet<String>();
		HSE.add("Java");
		HSE.add("Phyton");
		HSE.add("Ruby");
		HSE.add("Java");
		
		for(String items:HSE)
		{
			System.out.println("1st Object "+items);
		}
		
		HashSet<String> HSE1=new HashSet<String>();
		HSE1.addAll(HSE);
		
		Iterator<String> HSEite=HSE1.iterator();
		
		while(HSEite.hasNext())
		{
		  System.out.println("new addition"+HSE.add("Java"));
			System.out.println("2st Object using iterator "+HSEite.next());

		}
		
		
	}

}
