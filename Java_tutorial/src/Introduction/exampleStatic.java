package Introduction;

public class exampleStatic {
	
	private String make;
	private static int refcount;
	protected int num=10;
	public String name1="suntiha";
	
	
	
	public String getmake()
	{
		System.out.println("make value is ..."+make);
		return make;
	}
	
	public int getref()
	{
		return refcount;
	}
	
	public static int  staticfun()
	{
		
		
		System.out.println("this is testing of static");
		return 10;
	}
	
	
	public  int  nonstaticfun()
	{
		
		
		System.out.println("this is testing of static");
		return 10;
	}

}
