package Introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//adding single ,multiple and sorting		
		List<String> listr=new ArrayList<String>();
		listr.add("one");
		listr.add("two");
		listr.add("three");
		
		System.out.println("before adding "+listr);
		
		String[] strArr={"four","five"};
		Collections.addAll(listr,strArr);
		System.out.println("after adding "+listr);

		Collections.addAll(listr,"six","seven","eight");
		System.out.println("after 2nd addition "+listr);
		Collections.sort(listr);
		System.out.println("After sort "+listr);

		
List<Integer>num=new ArrayList<Integer>();
num.add(12);

//adding objects to existing list objects		
Collections.addAll(num,34,23,8,30,6);
System.out.println("Integer values "+num);

//Min and Max 
System.out.println("max number is "+Collections.max(num));
System.out.println("max number is "+Collections.min(num));
		
//sorting the list Objects int
Collections.sort(num);
System.out.println("sorting values "+num );

//reversing the list objects
Collections.sort(num,Collections.reverseOrder());
System.out.println("reverse values "+num );

//converting Arrays to string
int[] numbers = {1, 2, 3, 4, 5, 6, 7};

//System.out.println(numbers.toString());
String str = Arrays.toString(numbers);
System.out.println("int array as String in Java : " + str);

//String reverse       
StringBuffer sve=new StringBuffer("this is a string");
System.out.println("revrse is "+sve.reverse());

	

//converting int(primitive) array to list  example
 int[] als={5,7,8,3,1,45,546};
List<Integer> ant=new ArrayList<Integer>();
for(int al:als)
{
	ant.add(al);
}
System.out.println("list is "+ant);

Collections.sort(ant);
System.out.println("after sort "+ant);

//converting Integer(wrapper class) array to List using asList

Integer[] ar11={10,34,45,67,23,1,3,5,6};
List<Integer>al1=Arrays.asList(ar11);
System.out.println("list "+al1);
Collections.sort(al1);
System.out.println("seee "+al1);

//converting String(wrapper class) array to List using asList


String[] ar1={"one","two","three","four","five","six"};
List<String>car1=Arrays.asList(ar1);
System.out.println("after convertion "+ar1);
Collections.sort(car1);
System.out.println("after sort "+car1);
Collections.sort(car1, Collections.reverseOrder());
System.out.println("reverse order "+car1);

 
// Arrays.sort

int[] als1={5,7,8,3,1,45,546};
//System.out.println("sort after "+als1);
Arrays.sort(als1);
for(int item:als1)
{
	System.out.println("after sort "+item);

}

Integer[] awe={10,34,45,67,23,1,3,5,6};
Arrays.sort(awe);
for(Integer item:awe)
{
	System.out.println("after sort "+item);

}


String[] Sar1={"one","two","three","four","five","six"};
Arrays.sort(Sar1);
System.out.println("dds"+ Sar1);
for(String item:Sar1)
{
	System.out.println("after sort "+item);

}

		

	}

}
