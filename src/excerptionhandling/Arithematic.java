package excerptionhandling;

public class Arithematic {
	public static void main(String[] args) {
		
	
int i= 10;
int n=0;
try {
	int c=i/n;// risky code
	System.out.println(c);
}
catch (ArithmeticException monkey) {
	System.out.println("eXCEPTION IS HANDLED");
}
	}
}
