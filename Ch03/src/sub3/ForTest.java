package sub3;
/*
 * 날짜 : 2022/08/17
 * 이름 : 이민혁
 * 내용 : Java 반복문For 실습하기
 */

public class ForTest {
      public static void main(String[] args) {
		
    	  //for 
    	  for(int i = 1 ; i <= 5 ; i++) {
    		  System.out.println("i : " +i);
    	  }
    	  
    	  
    	  // 1부터 10까지 합
    	  int sum = 0;
    	  for (int i = 1; i <= 10; i++) {
    		  sum += i;
    	      System.out.println("1부터 10까지 합 : " +sum);
    	  }
    	  // 1부터 10까지 짝수합
    	  
    	  int tot = 0;
    	  for (int i = 1 ; i <= 10; i++) {
    		  if (i % 2 == 0) {
    		  tot += i; 
    		  }
    	  }
    	  
    	  System.out.println("1부터 10까지 짝수합 : " +tot); 
    		  
    	  // 중첩 for
    	  
    	  for (int a=1 ; a<=3 ; a++) {
    		  System.out.println("a : " +a);
    		  for (int b=1 ; b<=5 ; b++) {
    			  System.out.println("b : " +b);
    			  
    		  }
    	  }
    	  
    	  // 구구단
    	  for (int a=2; a<10; a++ ) {
    		  System.out.println(a + "단을 출력합니다.");
    		  for (int b=1; b<10; b++) {
    			  System.out.println(a + "x" + b + "=" + a*b );
    		  }
    	  }
    	  // 별삼각형
    	  		for(int start =10; start >= 1; start--) {
    	  			for(int end = 1; end <= start; end++) {
    	  				System.out.print("★");
    	  			}
    	  			System.out.print("\n"); //개행줄바꿈
    	  		}
    	  		
	}
}
