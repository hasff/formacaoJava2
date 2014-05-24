
public class Program {

	public static void main(String[] args) {
		int num1 = 53;
		int num2 = 47;
		byte num3 = (byte)(num1 + num2);
		
		System.out.println(num3);
		
		int num4 = Integer.MAX_VALUE;
		int num5 = Integer.MAX_VALUE;
		byte num6 = (byte)(num4 + num5);
		
		System.out.println(num6);
		
		byte num7 = (byte)Integer.MAX_VALUE;
		System.out.println(num7);
		
		
	}	
}
