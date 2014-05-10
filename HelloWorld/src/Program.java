
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("HelloWorld");
		System.out.println();
		System.out.println();
		System.out.println();
		
		if (args != null && args.length > 0){
			System.out.print("Lista de Parametros: ");
			/*
			for(String s : args){
				System.out.print(s + " ");
			}
			*/
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
		
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
