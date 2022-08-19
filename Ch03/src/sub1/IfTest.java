package sub1;

/* 날짜 : 2022/08/17
 * 이름 : 이민혁
 * 내용 : 조건문 if 에 대해 알아보기 
 * 
 * 
 * 
 */
public class IfTest {
	public static void main(String[] args) {
		
		// if
	       int num1 = 1;
	       int num2 = 2;
	    
	       if (num1 < num2) { 
	    	   //조건이 참 일때 실행
	               System.out.println("num1 은 num2 보다 작다");}
	       if(num1 > num2) {
	    	   System.out.println("num1 은 num2 보다 크다");
	       }
	       if (num1> 0) { 
	    	   if (num2 > 1) {
	    		  System.out.println("num1 은 0보다 크고 num2 는 1보다 크다");
	    	   }
	       }
	       
	       if (num1 > 0 && num2 > 1) {
	    	   System.out.println("num1 은 0보다 크고 그리고 num2 는 1보다 크다");
	       }
	
		// if ~ else 
	       int var1 = 1, var2 = 2;
	       if (var1 > var2) {
	    	   // 조건이 참 일때
	    	   
	    	   System.out.println("var1이 var2 보다 크다");
	       } else {
	    	   // 조건이 거짓 일때
	    	   System.out.println("var1 이 var2 보다 작다");
	       }
	       
		// if ~ else if ~ else
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if ( n1 > n2) {
			System.out.println("n1 은 n2 보다 크다");
		} else if (n2 < n3)  {
			System.out.println("n3 은 n2 보다 크다");
		} else if (n3 > n4) {
			System.out.println("n3 은 n4 보다 크다 ");
		} else {
			System.out.println("n4 가 가장 크다");
		}
		
		
	}

}
