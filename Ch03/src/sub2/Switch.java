package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2022/08/17
 * 이름  : 이민혁
 * 내용 : Java Switch 알아보기 
 */
public class Switch {
      public static void main(String[] args) {
         
    	  // 사용자 입력 
    	  System.out.print("숫자를 입력 : ");
    	  
    	  Scanner sc = new Scanner(System.in);
    	  int number = sc.nextInt();
    	  
    	  System.out.println("입력한 숫자 : " +number);
    	  
    	  switch(number % 2) {
    	  case 0 : 
    		  System.out.println("number는 짝수입니다.");
    		  break;
    		  
    	  case 1:
    		  System.out.println("number는 홀수입니다.");
    		  break;
    	  
    	  }
	}
}
