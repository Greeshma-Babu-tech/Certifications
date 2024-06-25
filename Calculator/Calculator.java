
public class Calculator {
	// Addition
	//Method Overloading
	public static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum of digits="+sum);
	}
	public static void add(float a,float b)
	{
		float sum=a+b;
		System.out.println("The sum of digits="+sum);
	}
	public static void add(double a,double b)
	{
		double sum=a+b;
		System.out.println("The sum of digits="+sum);
	}
	// Subtraction
	//Method Overloading
	public static void sub(int a,int b)
	{
		int dif=a-b;
		System.out.println("The Difference of digits="+dif);
	}
	public static void sub(float a,float b)
	{
		float dif=a-b;
		System.out.println("The Difference of digits="+dif);
	}
	public static void sub(double a,double b)
	{
		double dif=a-b;
		System.out.println("The Difference of digits="+dif);
	}
	// Multiplication
	//Method Overloading
	public static void product(int a,int b)
	{
		int prod=a*b;
		System.out.println("The Product of digits="+prod);
	}
	public static void product(float a,float b)
	{
		float prod=a*b;
		System.out.println("The Product of digits="+prod);
	}
	public static void product(double a,double b)
	{
		double prod=a*b;
		System.out.println("The Product of digits="+prod);
	}
	// Division
	//Method Overloading
	public static void Div(int a,int b)
	{
		float division=a/b;
		System.out.println("Result="+division);
	}
	public static void Div(float a,float b)
	{
		float division=a/b;
		System.out.println("Result="+division);
	}
	public static void Div(double a,double b)
	{
		double division=a/b;
		System.out.println("Result="+division);
	}
	// Square Root
	public static void sqroot(double a)
	{
		double sq=Math.sqrt(a);
		System.out.println("Square Root="+sq);
	}
	//Modulus
	public static void Mod(double a,double b)
	{
		double m=a%b;
		System.out.println("Remainder="+m);
	}
}
