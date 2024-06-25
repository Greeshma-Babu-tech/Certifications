
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		boolean op=false;
		Scanner sc= new Scanner(System.in);
		Calculator calc=new Calculator();
		do {
		System.out.println("Select Operation (Enter Choice Number) : \n1. Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Square Root\n6.Modulus(%)");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter Value 1");
			double a1=sc.nextDouble();
			System.out.println("Enter Value 2");
			double b1=sc.nextDouble();
			calc.add(a1,b1);
			break;
		case 2:
			System.out.println("Enter Value 1");
			double a2=sc.nextDouble();
			System.out.println("Enter Value 2");
			double b2=sc.nextDouble();
			calc.sub(a2,b2);
			break;
		case 3:
			System.out.println("Enter Value 1");
			double a3=sc.nextDouble();
			System.out.println("Enter Value 2");
			double b3=sc.nextDouble();
			calc.product(a3,b3);
			break;
		case 4:
			System.out.println("Enter Value 1");
			double a4=sc.nextDouble();
			System.out.println("Enter Value 2");
			double b4=sc.nextDouble();
			calc.Div(a4,b4);
			break;
		case 5:
			System.out.println("Enter Value 1");
			double a5=sc.nextDouble();
			calc.sqroot(a5);
			break;
		case 6:
			System.out.println("Enter Value 1");
			double a6=sc.nextDouble();
			System.out.println("Enter Value 1");
			double b6=sc.nextDouble();
			calc.Mod(a6,b6);
			break;
		default:System.out.println("Invalid Choice");
		}
		System.out.println("Do you want to perform another Operation? (Y/N)");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("Y"))
		{
			op=true;
		}
		else if(ch.equalsIgnoreCase("N"))
		{
			op=false;
		}
		else
			System.out.println("Enter Y/N");
		
		}while(op);
	}

}
