
public class Program {

	public static void main(String[] args) {
		//Program.stringBuild();
		//Program.stringNormal();
		
		Program.conditionalOps();
		Program.conditionalOpsBitwise();
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

	public static void conditionalOps(){
		int i = 2; 
		
		if (i<1 && i++>3){
			
		}
		
		System.out.println(i);
		
		int j = 2; 
		
		if (j>1 || j++>3){
			
		}
		
		System.out.println(j);
	}
	
	public static void conditionalOpsBitwise(){
		int i = 2; 
		
		if (i<1 & i++>3){ // 0 & 0 => 0 
			
		}
		
		System.out.println(i);
		
		int j = 2; 
		
		if (j>1 | j++>3){
			
		}
		
		System.out.println(j);
	}
	
}

