
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("HelloWorld");
		System.out.println();
		System.out.println();
		System.out.println();
		
		//sol1(args);
		//sol2(args);
		//sol3(args);
		//sol4(args);
		//sol5(args);
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	private static void sol1(String[] args){
		if (args != null && args.length > 0){
			System.out.print("Lista de Parametros: ");

			for(String s : args){
				System.out.print(s + " ");
			}
		}
		else{
			System.out.println("(!) nao existem parametros!");
		}		
	}
	
	private static void sol2(String[] args){
		if (args != null && args.length > 0){
			System.out.print("Lista de Parametros: ");
			for (int i = 0; i < args.length; i++){
				System.out.print(args[i]);
				if (i != args.length-1){
					System.out.print(" # ");
				}
			}
		}
		else{
			System.out.println("(!) nao existem parametros!");
		}		
	}
	
	private static void sol3(String[] args){
		if (args != null && args.length > 0){
			System.out.print("Lista de Parametros: ");

			int i = 0; 
			for (; i < args.length-1; i++){
				System.out.print(args[i] + " # ");
			}
			System.out.print(args[i]);
		}
		else{
			System.out.println("(!) nao existem parametros!");
		}		
	}
	
	private static void sol4(String[] args){
		int i; 
		for (i = 0; i < args.length-1; i++){
			System.out.print(args[i] + " * ");
		}
		
		if (args.length != 0){
			System.out.print(args[i]);	
		}
		else{
			System.out.println("(!) nao existem parametros!");
		}		
	}
	
	private static void sol5(String[] args){
		sol5Rec(args, 0);
	}
	
	private static void sol5Rec(String[] args, int currPos){
		if (args.length == 0) {
			System.out.println("(!) nao existem parametros!");
			return;
		}
		   
		if (currPos == args.length-1){
			System.out.print(args[currPos]);
			return;
		}
		else{
			System.out.print(args[currPos] + " # ");
			sol5Rec(args, currPos + 1);
		}
	}
}

