package Introduction;

import java.util.HashMap;
import java.util.Map;

public class ObjectExample extends InheritenceExample{
	
	public static int num=10;
	public  int num1=10;

	public static void main(String[] args)
	{
		ObjectExample ObjE=new ObjectExample();
		ObjE.meth1();
		System.out.println("in method 1 "+num);

		
	}

	
	public  void meth1()
	{
		System.out.println("in method 1 "+num);
		inMethod();
		meth2();
	}
	
	
	public  void meth2()
	{
		System.out.println("in method 2 "+num);
		inMethod();
		
		Map<Integer,String> hm=new HashMap<Integer,String>();  

	}
	
}
