package sub03;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2022/09/13
 * 이름 : 이민혁
 * 내용 : 직렬화/역직렬화 실습하기
 * 
 * 객체의 직렬화
 * - 자바 객체를 스트림을 통해 외부 파일로 생성하는 작업
 * - 스트림으로 전송될 객체는 Serializable 인터페이스 구현
 * 
 * 
 */

public class DESerializeTest {
		public static void main(String[] args) throws Exception{
			
			String path = "C:\\Users\\java1\\Desktop\\Apple.dat";
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 가져오기(역직렬화)
			Apple a1 = (Apple) ois.readObject();
			Apple a2 = (Apple) ois.readObject();
			
			ois.close();
			fis.close();
			
			a1.show();
			a2.show();
			
			
			System.out.println("역직렬화 완료");
			
		} // main end
}
