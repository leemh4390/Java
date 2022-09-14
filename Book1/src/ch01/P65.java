package ch01;

public class P65 {
		public static void main(String[] args) {
			
			byte bNum = 10;
			int iNum = bNum;
			
			System.out.println(bNum);
			System.out.println(iNum);
			
			int iNum2 = 20;
			float fNum = iNum2;
			
			System.out.println(iNum);
			System.out.println(fNum);
			
			double dNum;
			dNum = fNum + iNum;
			System.out.println(dNum);
			
			char ch1 = 'A';
			System.out.println((int)ch1);
			
			int ch2 = 67;
			System.out.println((char)ch2);
			
		}
}
