package sub01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.Buffer;

/*
 * 날짜 : 2022/09/21 
 * 이름 : 이민혁
 * 내용 : Http 통신 실습하기
 * 
 * HTTP 통신
 * - TCP/IP 프로토콜을 이용한 단방향 통신 (Stateless)
 * - 일반적인 웹 프로그래밍은  HTTP 통신을 이용
 */

public class HttpTest {
	public static void main(String[] args) throws Exception{ 
		
		URL url = new URL("http://google.com");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		
		String line = null;
		
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
			
			br.close();
		
	} // main end
}
