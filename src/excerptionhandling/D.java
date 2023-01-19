package excerptionhandling;

public class D {
public static void main(String[] args) {
	int a=1;
	int b=0;
	
	try {
		int c=a/b;
		System.out.println(c);
	}
	catch(RuntimeException money) {
		System.out.println("exception is handled");
	}
}
}
