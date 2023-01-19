package excerptionhandling;


public class C {
public static void main(String[] args) {
	int a=1;
	int b=0;
	try {
		int c=a/b;
		System.out.println(c);
	}
catch(ArithmeticException monkey) {
	System.out.println("exception is handled");
}
	
}
}
