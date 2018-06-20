package Introduction;

public class Car {

	private String make;
	private String model;
	public String color;
	int year;
	
	public void makeandmodel()
	{
		System.out.println("branded car");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(int year) {
		if(year>2000){
		this.year = year;
		}else year=1000;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	void newmethod()
	{
System.out.println("makke is eve" +make);	
	
	
	
	for (int num=1;num<6;num++)
	{
	 switch(num)
	 {
	 case 1:
		 System.out.println("option printed is "+num);
		 break;
	 case 2:
		 System.out.println("option printed is "+num);
	 break;
	 case 3:
		 System.out.println("option printed is "+num);
		 break;
	 case 4:
		 System.out.println("option printed is "+num);
		 break;
		 default:
			 System.out.println("option printed default is "+num);

	 }
}
	}
	}
	
