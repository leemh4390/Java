package sub02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 날짜 : 2022/09/13 
 * 이름 : 이민혁
 * 내용 : 보조 스트림 실습하기
 * 
 * 버퍼(Buffer) 스트림
 * - 기본 입출력에 Buffer 를 추가해서 빠른 입출력을 지원하는 스트림
 * - 기본 입출력에 무조건 장착해야 실행 성능 향상
 * 
 */

public class BufferIOTest {
	public static void main(String[] args) {
		
		String path = "C:\\Users\\java1\\Desktop\\Java.pdf"; //Input
		String target = "C:\\Users\\java1\\Desktop\\Java2.pdf"; //Output
		
		try {
			// 파일과 스트림 연결
			FileInputStream fis = new FileInputStream(path);
			FileOutputStream fos = new FileOutputStream(target);
			
			// 보조 스트림(Buffer) 생성 연결
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos); 
			
			
			while(true) {
				
					int value = bis.read();
					
				if (value == -1) {
					// 파일을 모두 읽었으면 
					break;
				}
				
				//char c = (char) value;
				//System.out.print(c);
				
				//파일쓰기
				bos.write(value);
				
			} 
			
			// 스트림해제
			bis.close();
			bos.close();
			fis.close();
			fos.close();
			
			System.out.println("쓰기 완료!");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	} // main end
}
