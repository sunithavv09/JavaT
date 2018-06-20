package Introduction;

public class overridefun2 extends overridefun  {
	
	static int bal=40;
	
	
	
	public  void funover()
	{
		System.out.println("in child static class funover");

	}

	
	public  void funover1hj()
	{
		System.out.println("in child non class");
		funover1hj22();
		funover1();
System.out.println("value is "+super.bal);
}

	
	public  void funover1hj22()
	{
		System.out.println("in child 2nd non class");

	}
	
	public  void funover1()
	{
		System.out.println("in child non static class");

	}
	
	public void funover2()
	{
		System.out.println("in child  final methd");

	}

	
}
