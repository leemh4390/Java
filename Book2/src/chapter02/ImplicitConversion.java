package chapter02;

public class ImplicitConversion {
	public static void main(String[] args) {
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println("byte : " + bNum);
		System.out.println("int : " + iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println("int : " + iNum);
		System.out.println("float : " + fNum);
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println("double : " + dNum);
	}
}
