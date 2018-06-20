package Introduction;

public class DataModifiersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		float flvalue=1233434.9f;
		float fval=(float)123.33;
		
		int intVal=(int)flvalue;
		
		String str2=Float.toString(fval);
		
		System.out.println("float to string "+str2);
		
System.out.println("integer value is "+intVal );
System.out.println(" value is "+fval );

String str="1234.345";
String str1="2323.343";
double dl=Double.parseDouble(str);
double d2=Double.valueOf(str1);
System.out.println("string to double "+dl);
System.out.println("string to double "+d2);

double dll=123.00;
double dl2=1234.45;

System.out.println("double to string "+String.valueOf(dll));
System.out.println("double to string "+Double.toString(dl2));




	}

}
