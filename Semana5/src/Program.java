
public class Program {

	public static void main(String[] args) {
		Program.stringBuild();
		Program.stringNormal();
	}
	
	public static void stringBuild(){
		StringBuilder a = new StringBuilder("Hello");
		StringBuilder b = a; 
		
		a.append(" World");
		System.out.println(a + " +++ " + b);
		
		a = a.append(" World");
		System.out.println(a + " +++ " + b);
	}
	
	public static void stringNormal(){
		String a = "Hello";
		String b = a; 
		
		a.concat(" World!");
		System.out.println(a + " +++ " + b);
		
		a = a.concat(" World!");
		System.out.println(a + " +++ " + b);
	}

}

