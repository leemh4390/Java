package sub03;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 이민혁
 * 내용 : 직렬화/역직렬화 실습하기
 * 
 */

public class SerializeTest {
		public static void main(String[] args) throws Exception{
			
			Apple a1 = new Apple("한국", 5000);
			Apple a2 = new Apple("일본", 3000); 
			
			String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
			
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객체 내보내기 (직렬화)
			oos.writeObject(a1);
			oos.writeObject(a2);
			
			oos.close();
			fos.close();
			
			
			System.out.println("직렬화 완료");
			
		} // main end
}
