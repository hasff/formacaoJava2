import java.util.ArrayList;


public class Program {
	public static void main(String[] args){
		//teste2();
		//teste3();
		//teste3foreach();
		//teste4();
		//teste5();
		//teste6();
		//teste7();
		//teste8();
	}
	
	private static void teste1(){
		int [] ages0 = new int[]{1,2,3,4,5};
		
		int [] ages1 = {1,2,3,4,5};
		
		/*// nao da!
		int [] ages2;
		ages2 = {1,2,3,4,5};
		*/
		
		/*// nao da!
		int [] ages3 = new int[5];
		ages3 = {1,2,3,4,5};
		*/
		
		int [] ages4 = new int[5];
		ages4 = new int[]{1,2,3,4,5};
	}
	
	private static void teste2(){
		int[][][] a = new int[1][1][1];
		
		a[0][0][0] = 100;
		

		int[][] abc = new int[3][];
		
		abc[0] = new int[1];
		abc[1] = new int[2];
		abc[2] = new int[3];
		
		System.out.println(abc.length + " <-- number of arrays in array abc");
		for (int i[] : abc){
			System.out.println(i.length);
		}
	}
	
	private static void teste3(){
		System.out.println("with for");
		System.out.println();
		
		int[][] abc = new int[4][];
		
		/* 
		 		abc[0] = new int[1];
				abc[1] = new int[2];
				abc[2] = new int[3];
				abc[3] = new int[2];
		 */
		
		abc[0] = new int[] {1};
		abc[1] = new int[]{1,2};
		abc[2] = new int[]{1,2,3};
		abc[3] = new int[]{1,2};
		
		for (int i = 0; i < abc.length; i++){
			for (int j = 0; j < abc[i].length; j++){
				System.out.print(abc[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static void teste3foreach(){
		System.out.println("with foreach");
		System.out.println();
		
		int[][] abc = new int[4][];
		
		/* 
		 		abc[0] = new int[1];
				abc[1] = new int[2];
				abc[2] = new int[3];
				abc[3] = new int[2];
		 */
		
		abc[0] = new int[]{1};
		abc[1] = new int[]{1,2};
		abc[2] = new int[]{1,2,3};
		abc[3] = new int[]{1,2};
		
		for (int[] arr : abc){
			for (int i : arr){
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
	
	private static void teste4(){
		System.out.println("teste4");
		System.out.println();

		ArrayList myList; 
		
		myList = new ArrayList();
		
		myList.add(1);
		myList.add(2);
		
		System.out.println(myList.size());
		
		myList.remove(0);
		
		System.out.println(myList.size());
		
		//int xpto = myList.get(0); // Object
		
		//Integer xpta = myList.get(0); // we have an Object here
		
		// needs splicit cast to Integer
		Integer xptb = (Integer)myList.get(0);
		int xptc = (Integer)myList.get(0);
		
	}
		
	private static void teste5(){
		System.out.println("teste5");
		System.out.println();

		ArrayList a = new ArrayList();
		
		a.add("John");
		a.add("ming");
		a.add("mary"); 
		a.add("prashant");
		a.add("mary");
		a.add("desmond");
		
		System.out.println(a);
		
		a.remove(0);
		a.remove(a.size()-1);
		a.remove("mary");
		
		System.out.println(a);
		
		a.add("mary");		
	}
	
	private static void teste6(){
		System.out.println("with while");
		System.out.println();
		
		int[][] abc = new int[4][];
		
		/* 
		 		abc[0] = new int[1];
				abc[1] = new int[2];
				abc[2] = new int[3];
				abc[3] = new int[2];
		 */
		
		abc[0] = new int[] {1};
		abc[1] = new int[]{1,2};
		//abc[2] = new int[]{1,2,3};
		abc[3] = new int[]{1,2};
		
		int i = 0, j = 0;
		while(i < abc.length){
			while(abc[i] != null && j < abc[i].length){
				System.out.print(abc[i][j++] + " ");
			}
			j = 0;
			i++;
			System.out.println();
		}
	}
	
	private static void teste7(){
		System.out.println("with do while");
		System.out.println();
		
		int[][] abc = new int[4][];
		
		/* 
		 		abc[0] = new int[1];
				abc[1] = new int[2];
				abc[2] = new int[3];
				abc[3] = new int[2];
		 */
		
		abc[0] = new int[] {1};
		abc[1] = new int[]{1,2};
		//abc[2] = new int[]{1,2,3};
		abc[3] = new int[]{1,2};
		
		int i = 0, j = 0; 
		
		if (abc.length == 0) return;
		
		do{
			if (abc[i] == null || abc[i].length == 0) {
				System.out.println("continue");
				continue;
			}
			do{
				System.out.print(abc[i][j] + " ");
			}
			while(++j < abc[i].length);
			j = 0;
			System.out.println();
		}
		while(++i < abc.length);
	}
	
	private static void teste8(){
		System.out.println("");
		System.out.println();
		
		for(int i = 0, j = 2; i < j; i++){
			
		}
		
		int a;
		char b;
		
		for (a = 0, b = 'B'; a < 10; a++){
			
		}
	}
}
