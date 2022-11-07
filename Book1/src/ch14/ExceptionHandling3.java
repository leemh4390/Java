package ch14;

import java.io.FileInputStream;

public class ExceptionHandling3 {
		public static void main(String[] args) {
			
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("a.txt");
			}catch(Exception e) {
				System.out.println(e);
				return;
			} finally {
				if(fis != null) {
					try {
						fis.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				System.out.println("항상 수행됩니다.");
			}
			System.out.println("여기도ㅓ 수행됩니다.");
		}
}
